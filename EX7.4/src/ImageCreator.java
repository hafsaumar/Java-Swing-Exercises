
import fi.uta.sis.pgui.posterizer.Posterizer;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingWorker;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hafsa Umar
 */
public class ImageCreator extends SwingWorker<BufferedImage, BufferedImage> {

    Icon image;
    JLabel target;
    int width; // size of the graphics in pixels
    int height; // size of the graphics in pixels

    public ImageCreator(Icon img, JLabel l, int width, int height) {
        image = img;
        target = l;
        this.width = width;
        this.height = height;
    }

    @Override
    protected BufferedImage doInBackground() throws Exception {
        // create an instance, provide the source image here:
        System.out.println("in do in background");
        BufferedImage im = new BufferedImage(image.getIconWidth(), image.getIconHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics g = im.createGraphics();
        image.paintIcon(target, g, 0, 0);
        Posterizer p = new Posterizer(im);
        // run the process until it is done (or you are happy with the result):
        while (!p.isDone()) {
            // start with divide() call
            p.divide();
            // then run optimize() until local optimum is reached, or you want to divide again 
            while (!p.localOptimum()) {
                p.optimize();
            }
        }
        //target.setIcon(image); //(Icon) p.getCurrent()
        return (BufferedImage) p.getCurrent();
    }

    protected void process(java.util.List<BufferedImage> chunks) {
        System.out.println("in process");
        for (BufferedImage i : chunks) {
            // Create final reference to the target label so it is accessible from anonymous class
            final JLabel l = target;
            // If we are already late with this graphics frame, display it immadiately
            l.setIcon(new ImageIcon(i));
        } // for each image
    }

    @Override
    protected void done() {
        System.out.println("in done methode");
        try {
            // In the end, display the final frame.
            BufferedImage i = get();
            System.out.println("1");
            target.setIcon(new ImageIcon(i));

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Icon getImage() {
        return target.getIcon();
    }
}
