package com.converter.Temperature;

import javax.swing.JOptionPane;

public class SelectorTempConv {

	public static void selection(String input) {
		if (input == null) {
			return;
		}

		Double unitValue = null;
		while (unitValue == null) {
			String value = (String) JOptionPane.showInputDialog(null,
					"Put the value",
					"Input",
					JOptionPane.PLAIN_MESSAGE,
					null,
					null,
					"");
			try {
				if (value == null) {
					return;
				}
				unitValue = Double.valueOf(value);

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "The loaded format is not correct", "Error", JOptionPane.ERROR_MESSAGE);
			}

		}
		
		switch (input) {
		case "ºC to ºF":
			TempConv.CtoF(unitValue);
			break;
		case "ºC to K":
			TempConv.CtoK(unitValue);
			break;
		case "ºF to ºC":
			TempConv.FtoC(unitValue);
			break;
		case "ºF to K":
			TempConv.FtoK(unitValue);
			break;
		case "K to ºC":
			TempConv.KtoC(unitValue);
			break;
		case "K to ºF":
			TempConv.KtoF(unitValue);
			break;
		default:
			break;
		}
	}
	
	
}
