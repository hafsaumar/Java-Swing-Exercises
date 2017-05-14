/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.uta;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import javax.swing.JPanel;

/**
 *
 * @author Hafsa Umar
 */
public class HouseGraphics extends JPanel {
     Image image;
     String caption;
    
    public void setImage(Image i) {
        this.image = i;
    }
    public void setCaption(String s){
        this.caption=s;        
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g.create();
        if (image != null){
            AffineTransform imageAdjust = AffineTransform.getScaleInstance((float)getWidth()/image.getWidth(this), (float)getHeight()/image.getHeight(this));
           g2.drawImage(image, imageAdjust, this);
           repaint();
        }
        if(caption !=null){
            g2.setFont(new Font("Arial", Font.BOLD, 32));
            g2.setColor(new Color(255, 255, 50));// For text, the coordinates specify the text left edge baseline. Baseline is bottom of characters like "G", but above the lovest point of e.g., "g" (with most fonts).
            g2.drawString(caption, getWidth() / 8, getHeight()/2);// repaint schedules later repaint of component, usually you don't want to call it in paintComponent but as can be seen, it is possible.
            repaint();
        }
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int size = Math.min(getWidth(), getHeight())/2;
        drawHouse(g2,  Color.yellow,40,40);
        g2.translate(size, 0);
        drawHouse(g2,  Color.green,50,50);
        g2.translate(size, 0);
        drawHouse(g2,  Color.red,70,70);
        g2.translate(size, 0);
        drawHouse(g2,  Color.blue,90,90);
        repaint();
    }
    
    void drawHouse(Graphics2D g,  Color color, int width, int height){
        int baseX = 10;
        int baseY = 300;
        g.setColor(color.darker());
        g.drawRect(baseX+2*width/5, baseY-height/3, width/5, height/3);
        g.setColor(color);
        g.setStroke(new BasicStroke(3));
        g.drawRect(baseX, baseY-height, width, height);
        int x[]= new int[3];
        x[0]=baseX;
        x[1]=baseX + width;
        x[2]=baseX +(width/2);
        int y[]= new int[3];
        y[0]=baseY - height;
        y[1]=baseY - height;
        y[2]=baseY - height - width/2;
        g.draw(new Polygon(x,y,3));
    }
}
