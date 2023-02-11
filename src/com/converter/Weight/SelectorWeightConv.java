package com.converter.Weight;

import javax.swing.JOptionPane;

public class SelectorWeightConv {

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
		case "kg to lb":
			WeightConv.kgtolb(unitValue);
			break;
		case "kg to oz":
			WeightConv.kgtooz(unitValue);
			break;
		case "lb to kg":
			WeightConv.lbtokg(unitValue);
			break;
		case "lb to oz":
			WeightConv.lbtooz(unitValue);
			break;
		case "oz to kg":
			WeightConv.oztokg(unitValue);
			break;
		case "oz to lb":
			WeightConv.oztolb(unitValue);
			break;
		default:
			break;
		}
	}
	
	
}