
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.util.Locale;
import javax.swing.Box;
import javax.swing.JComboBox;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hafsa Umar
 */
public class WeekTrayIcon extends TrayIcon implements ActionListener {

    static String EXIT_COMMAND = "exit";
    static String FORMAT_COMMAND = "set time format";
    DateTime weekProgram;

    public WeekTrayIcon(DateTime w) {
        super(createIconImage(), "Week of the Year");
        weekProgram = w;
        PopupMenu menu = new PopupMenu();
        MenuItem exit = new MenuItem("Exit");
        exit.setActionCommand(EXIT_COMMAND);
        MenuItem settimeformat = new MenuItem("set time format");
        settimeformat.setActionCommand(FORMAT_COMMAND);
        exit.addActionListener(this);
        settimeformat.addActionListener(this);
        menu.addSeparator();
        menu.add(settimeformat);
        menu.add(exit);
        setPopupMenu(menu);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(EXIT_COMMAND)) {
            weekProgram.setVisible(false);
            weekProgram.dispose();
            SystemTray.getSystemTray().remove(this);
        }
        if (e.getActionCommand().equals(FORMAT_COMMAND)) {
            weekProgram.setVisible(true);
            weekProgram.toFront();
        }
    }

    /**
     * This method builds a simple icon Image to be used in tray.
     */
    static Image createIconImage() {
        BufferedImage r = new BufferedImage(16, 16, BufferedImage.TYPE_4BYTE_ABGR);
        Graphics2D g = r.createGraphics();
        g.setColor(Color.WHITE);
        g.fill(new Ellipse2D.Double(2, 2, 12, 12));
        g.setColor(Color.BLACK);
        g.draw(new Ellipse2D.Double(2, 2, 14, 14));
        g.draw(new Line2D.Double(8, 8, 10, 4));
        return r;
    }

}
