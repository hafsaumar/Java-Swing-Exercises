
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This SwingWorker renders graphics frames (pictures of a tree) and the
 * background process returns them as BufferedImages. Buffered image is a pixel
 * based image, whose content is stored in memory. A JLabel is provided for a
 * constructor and the generated images are displayed in the label as results
 * are generated, i.e., the graphics animate one screen.
 */
public class NatureWorker extends SwingWorker<BufferedImage, BufferedImage> {

    JLabel target; // target label, whose icon is update once new frames can be displayed
    int width; // size of the graphics in pixels
    int height; // size of the graphics in pixels
    double growth; // growth per frame
    int frame; // frame duration in milliseconds
    int frames; // how many more frames to render

    long lastFrameTimestamp; // when was the last frame displayed, used to avoid displaying frames too often.

    /**
     * Constructor initiates the image generating SwingWorker. After the worker
     * has been created, execute() method can be called. The worker will update
     * the image of the JLabel given as a parameter to this constructor.
     *
     * @param l JLabel whose icon is updated with the generated images.
     * @param width int horizontal size of the generated images. Often the width
     * of JLabel l (l.getWidth()).
     * @param height int vertical size of the generated images. Often the height
     * of JLabel l (l.getHeight()).
     * @param growthPerFrame how much the tree grows each frame. For example
     * 0.5.
     * @param frameDuration how many milliseconds a single animation frame
     * lasts. For example 100 for 10 frames per second.
     * @param frames how many animation frames of graphics to create. Sets the
     * animation duration together with frameDuration. Together with growthPerFrame
     * also specifies to how far the tree grows.
     */
    public NatureWorker(JLabel l, int width, int height, double growthPerFrame, int frameDuration, int frames) {
        target = l;
        this.width = width;
        this.height = height;
        growth = growthPerFrame;
        frame = frameDuration;
        this.frames = frames;

        lastFrameTimestamp = -1;
    }

    /**
     * Update the latest graphics (intermediate results) into the screen (target
     * label). This is called in EventDispatchThread when one or more
     * intermediate results have been published.
     */
    protected void process(java.util.List<BufferedImage> chunks) {
        for (BufferedImage i : chunks) {
            // Create final reference to the target label so it is accessible from anonymous class
            final JLabel l = target;
            // If we are already late with this graphics frame, display it immadiately
            l.setIcon(new ImageIcon(i));
        } // for each image
    }

    /**
     * This is called in EventDispatchThread once processing has finished. We
     * update the label.
     */
    @Override
    protected void done() {
        try {
            // In the end, display the final frame.
            BufferedImage i = get();
            target.setIcon(new ImageIcon(i));
        } catch (InterruptedException | ExecutionException | CancellationException ex) {
        }
    }

    /**
     * This method draws tree picture frames and publishes them according to the
     * frame rate requested, or slower if processing takes longer. The final
     * frame is returned as the result.
     *
     * @return BufferedImage the final frame.
     */
    @Override
    protected BufferedImage doInBackground() {
        // Use the Nature class in the end of the file. 
        Nature n = new Nature();
        // Images are generated into BufferedImage objects.
        BufferedImage r = null;
        // Loop until cancelled or enough frames generated
        while (frames-- > 0 && !isCancelled()) {
            // Create appropriately sized new BufferedImage.
            r = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
            // We can draw to a buffered image via Graphics2D (access to pixel raster is also possible)
            Graphics2D g = r.createGraphics();
            // clear the background
            g.setColor(Color.WHITE);
            g.fill(new Rectangle2D.Float(0, 0, width, height));
            // Calling paintComponent ourselves is okay, at least in this case.
            n.draw(g, width, height);
            if (!isCancelled()) {
                publish(r); // publish the frame
                // first check what time it is right now, use the milliseconds since epoch value
                long now = new Date().getTime();
                // if this is the first time, initialize the timestamp so that we will immediately update the first frame
                if (lastFrameTimestamp < 0) {
                    lastFrameTimestamp = now - frame;
                }

                if (lastFrameTimestamp + frame > now) {
                    try {
                        Thread.sleep((int) ((lastFrameTimestamp + frame) - now));
                    } catch (InterruptedException ex) {
                        break;
                    }
                }
                // Update the timestamp after each frame.
                lastFrameTimestamp += frame;

                n.grow(growth); // grow three for the next frame
            }
        }
        return r;
    }
}

/**
 * This class contains the actual graphics routines. You can have a look if you
 * are interested in painting methods applied etc. but you can just ignore this
 * for the exercise.
 */
class Nature {
    // Trunk is a path that consists of straight lines.

    Path2D treeTrunk;
    // Area is an object which allow us to do union, difference
    // etc. operation. In this case we combine many ellipses to
    // a complex area. Area is an instance of Shape.
    Area treeLeaves;
    // Width of the tree trunk on bottom, specifies the tree size and complexity.
    double width = 5;

    public Nature() {
        super();
        updateGraphics();
    }

    public void grow(double amount) {
        width += amount;
        updateGraphics();
    }

    /**
     * Rebuilds the trunk path and leaf area objects according to the current
     * trunk width.
     */
    protected void updateGraphics() {
        // decide the level of recursive detail by tree size
        int trunkLevels = (int) (width / 10);
        treeTrunk = new Path2D.Double();
        // move the line to start position
        treeTrunk.moveTo(-0.5 * width, 0);
        // Generate the trunk line.
        Nature.buildTrunk(treeTrunk, trunkLevels, new Point2D.Double(-0.5 * width, 0), new Point2D.Double(0.5 * width, 0));
        // and close the path.
        treeTrunk.closePath();

        // decide the level of recursive detail by tree size
        int leafLevels = (int) (width / 12.5) + 1;
        treeLeaves = new Area();
        // add individual leaf parts to this area.
        buildLeaves(treeLeaves, leafLevels, new Point2D.Double(-0.5 * width, 0), new Point2D.Double(0.5 * width, 0));
    }

    /**
     * This method adds point to the trunk path. It is given a path where
     * current point is already the baseLeft start point. The method recursively
     * calls itself to generate branches.
     */
    static void buildTrunk(Path2D p, int levels, Point2D baseLeft, Point2D baseRight) {
        Point2D tip = getTip(baseLeft, baseRight);
        // If still more levels needed, calculate some points and recursively generate the parts
        if (levels > 0) {
            Point2D leftLower = getP1(baseLeft, tip);
            Point2D leftUpper = getP2(baseLeft, tip);
            // draw the initial line
            p.lineTo(leftLower.getX(), leftLower.getY());
            // recurse left branch
            buildTrunk(p, levels - 1, leftLower, leftUpper);
            Point2D rightLower = getP1(baseRight, tip);
            Point2D rightUpper = getP2(baseRight, tip);
            // recurse top
            buildTrunk(p, levels - 1, leftUpper, rightUpper);
            // recurse right branch
            buildTrunk(p, levels - 1, rightUpper, rightLower);
        } else {
            // If no more recursion, draw line to the tip
            p.lineTo(tip.getX(), tip.getY());
        }
        // finish by drawing line to the end point.
        p.lineTo(baseRight.getX(), baseRight.getY());
    }

    /**
     * This method adds ellipses to the given Area. The method recursively calls
     * itself to find position, the end of recursion generates the actual
     * ellipses.
     */
    static void buildLeaves(Area a, int levels, Point2D baseLeft, Point2D baseRight) {
        Point2D tip = getTip(baseLeft, baseRight);
        double radius = baseLeft.distance(baseRight) * 6;
        // if no more recursion, add the ellipse
        if (levels == 0) {
            // adding an area to another results in union type operation.
            // An area can be created from a Shape.
            a.add(new Area(new Ellipse2D.Double(tip.getX() - radius, tip.getY() - radius, radius * 2, radius * 2)));
        } else {
            // If need to recurse, calculate points
            Point2D leftLower = getP1(baseLeft, tip);
            Point2D leftUpper = getP2(baseLeft, tip);
            // recurse left branch
            buildLeaves(a, levels - 1, leftLower, leftUpper);
            Point2D rightLower = getP1(baseRight, tip);
            Point2D rightUpper = getP2(baseRight, tip);
            // recurse top
            buildLeaves(a, levels - 1, leftUpper, rightUpper);
            // recurse right brancs
            buildLeaves(a, levels - 1, rightUpper, rightLower);
        }
    }

    /**
     * This method, given the bottom coordinates of a tree (section), calculates
     * the tip location.
     */
    static Point2D getTip(Point2D left, Point2D right) {
        double tipX = (left.getX() + right.getX()) / 2 - 5 * (right.getY() - left.getY());
        double tipY = (left.getY() + right.getY()) / 2 + 5 * (right.getX() - left.getX());
        return new Point2D.Double(tipX, tipY);
    }

    /**
     * This method calculates the first midpoint within a line between bottom
     * point and tip by weighted average.
     */
    static Point2D getP1(Point2D start, Point2D end) {
        double sxl = (start.getX() * 7 + end.getX() * 5) / 12;
        double syl = (start.getY() * 7 + end.getY() * 5) / 12;
        return new Point2D.Double(sxl, syl);
    }

    /**
     * This method calculates the second midpoint within a line between bottom
     * point and tip by weighted average.
     */
    static Point2D getP2(Point2D start, Point2D end) {
        double exl = (start.getX() * 6 + end.getX() * 6) / 12;
        double eyl = (start.getY() * 6 + end.getY() * 6) / 12;
        return new Point2D.Double(exl, eyl);
    }

    protected void draw(Graphics g, int width, int height) {
        g = g.create(); // we do a lot of transforms, do them to a new copy.
        Graphics2D g2 = (Graphics2D) g;
        g2.addRenderingHints(new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON));
        g2.setStroke(new BasicStroke(1.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        // The trees are generated around origo, translate so that we get them nicely visible.
        g2.transform(AffineTransform.getTranslateInstance(width / 2, height - height / 12));
        // My algorithm lives in a coordinate space where y+ is up
        // with this simple transform, I can change the coordinate 
        // space of Graphics2D
        g2.transform(AffineTransform.getScaleInstance(1, -1));
        // also do a bit zooming, this could of course be
        // combined with the line above
        g2.transform(AffineTransform.getScaleInstance(2, 2));
        // Do the actual drawing
        // Set exact color
        g2.setColor(new Color(50, 200, 50));
        // first fill leaves
        g2.fill(treeLeaves);
        // then draw the outline
        g2.setColor(Color.BLACK);
        g2.draw(treeLeaves);
        // the same for trunk.
        g2.setColor(new Color(150, 100, 50));
        g2.fill(treeTrunk);
        g2.setColor(Color.BLACK);
        g2.draw(treeTrunk);
    }
}
