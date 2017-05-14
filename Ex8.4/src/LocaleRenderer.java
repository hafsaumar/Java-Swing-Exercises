
import java.awt.Component;
import java.util.Locale;
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
public class LocaleRenderer extends JLabel implements ListCellRenderer<Object> {
	Locale locale;
	
	public LocaleRenderer(Locale l) {
		super();
		// by default JLabels are transparent but we 
		// want to control background so we go opaque
		setOpaque(true);
		locale = l;
	}
	
	public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
		Locale l = (Locale)value;
		// displayed values are provided by locale, 
		// we provide the current locale to get them
		// in correct language.
		setText(l.getDisplayCountry(locale) + ", " + l.getDisplayLanguage(locale));
		// adjust background so that selection is visible etc.
		if (isSelected) {
			setBackground(list.getSelectionBackground());
			setForeground(list.getSelectionForeground());
		} else {
			setBackground(list.getBackground());
			setForeground(list.getForeground());
		}
		return this;
	}
}