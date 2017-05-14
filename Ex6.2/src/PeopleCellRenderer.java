
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hafsa Umar
 */
public class PeopleCellRenderer implements ListCellRenderer<String> {

    JLabel stamper; // This JLabel instance is recycled each time

    public PeopleCellRenderer() {
        stamper = new JLabel();
        stamper.setOpaque(true); // make bg color visible
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends String> list, String value, int index, boolean isSelected, boolean cellHasFocus) {
        stamper.setText(value); // Update the actual content
        // Use bold font for the selected cell
        stamper.setFont(stamper.getFont().deriveFont(cellHasFocus ? Font.BOLD : Font.PLAIN));
        // Set background to white or gray, for odd and even numbered rows
        stamper.setBackground((index % 2 == 0) ? Color.WHITE : Color.LIGHT_GRAY);
        // Highlight selection with orange background.
        if (isSelected) {
            stamper.setBackground(Color.BLUE);
        }
        // return the component, its paint() method will be called
        return stamper;
    }

}
