package com.converter.Currency;
import javax.swing.JOptionPane;
public class SelectorCurrencyConv {


	public static void selection(String input) {
		if (input == null) {
			return;
		}

		Double unitValue = null;
		while (unitValue == null) {
			String valor = (String) JOptionPane.showInputDialog(null,
					"Ingrese el monto",
					"Input",
					JOptionPane.PLAIN_MESSAGE,
					null,
					null,
					"");
			try {
				if (valor == null) {
					return;
				}
				unitValue = Double.valueOf(valor);

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "El formato cargado no es correcto", "Error", JOptionPane.ERROR_MESSAGE);
			}

		}
		
		switch (input) {
		case "USD to EUR":
			CurrencyConv.USDtoEUR(unitValue);
			break;
		case "EUR to USD":
            CurrencyConv.EURtoUSD(unitValue);
			break;
		default:
			break;
		}
	}
	
}
