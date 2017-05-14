
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hafsa Umar
 */
public class FaceGraphics extends JPanel {
    float eye1x = 0;
    float eye1y = 0;
    float eye2x = 0;
    float eye2y = 0;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        int size = Math.min(getWidth(), getHeight()) / 2;
        g2.scale(size / 16.0, size / 16.0);
        g2.setStroke(new BasicStroke(1));
        g2.draw(new Ellipse2D.Double(2, 2, 30, 30));
        g2.setStroke(new BasicStroke(1 / 2));
        g2.draw(new Ellipse2D.Double(8, 10, 6, 6)); //first eye
        g2.draw(new Ellipse2D.Double(20, 10, 6, 6)); //second eye
        drawMouth(g2);
        //g2.draw(new Ellipse2D.Double(10.5, 12.5, 1, 1));

        double angle = getAngle(10,12);

        ((Graphics2D) g2).rotate((getAngle(eye1x, eye1y) - angle), 10.5, 12.5);
        g2.setColor(Color.BLUE);
        eye1x = MouseInfo.getPointerInfo().getLocation().x > 8 ? 12 : 10;
        eye1y = MouseInfo.getPointerInfo().getLocation().y >10 ? 14 : 12;
        g2.fill(new Ellipse2D.Double(eye1x, eye1y, 2, 2));
        
        double angle2 = getAngle(22,12);

        ((Graphics2D) g2).rotate((getAngle(eye2x, eye2y) - angle2), 22.5, 12.5);
        
        eye2x = MouseInfo.getPointerInfo().getLocation().x > 20 ? 24 : 22;
        eye2y = MouseInfo.getPointerInfo().getLocation().y > 10? 14: 12;
        
        g2.fill(new Ellipse2D.Double(eye2x, eye2y, 2, 2));
        
        repaint();
    }

    private void drawMouth(Graphics2D g2) {
        g2.setColor(Color.red);
        g2.setStroke(new BasicStroke(2));
        g2.draw(new Arc2D.Double(13, 25, 6, 4, 200, 150, Arc2D.OPEN));
    }

    public float getAngle(float x, float y) {
        float angle = (float) Math.toDegrees(Math.atan2(MouseInfo.getPointerInfo().getLocation().y - y,
                MouseInfo.getPointerInfo().getLocation().x - x));

        //if (angle < 0) {
        //    angle += 360;
        //}

        return (float) (angle * Math.PI * 2);
    }

}
