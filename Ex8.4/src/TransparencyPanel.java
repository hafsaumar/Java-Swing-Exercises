
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
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
public class TransparencyPanel extends JPanel {
	boolean transparency = false;
	
	public void setTransparency(boolean t) {
		transparency = t;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		if (transparency) {
			// Again colors with alpha value are used to
			// specify transparency. GradientPaint is used
			// to create a nice fade in transparency.
			Paint p = new GradientPaint(
				0.0f, 0.0f, new Color(200, 200, 200, 255), // First point x, y and color (r, g, b, alpha)
				0.0f, getHeight(), new Color(200, 200, 200, 0), // Second point x, y and color (r, g, b, alpha)
				false); // cyclic
			g2.setPaint(p);
			g2.fillRect(0, 0, getWidth(), getHeight());
		} else {
			super.paintComponent(g);
		}
	}
}
