package com.converter.Home;

import javax.swing.JOptionPane;


import com.converter.Currency.*;
import com.converter.Temperature.*;
import com.converter.Weight.*;
public class Home {

	public static void main(String[] args) {
		
		int menu;


		do {
			String[] options = {"Temperature", "Currency","Weight"};
			String cuadroOpciones = (String) JOptionPane.showInputDialog(null,
					"Select a conversion method",
					"Home",
					JOptionPane.INFORMATION_MESSAGE,
					null,
					options,
					"Currency");
			if (cuadroOpciones != null) {
				switch (cuadroOpciones) {
				case "Temperature": {
					String tempOptions = (String) JOptionPane.showInputDialog(null,
							"Select the conversion unit",
							"Temperature",
							JOptionPane.INFORMATION_MESSAGE,
							null,
							new Object[] {"ºC to ºF", "ºC to K", "ºF to ºC", "ºF to K", "K to ºC", "K to ºF"},
							"ºC to ºF");
					SelectorTempConv.selection(tempOptions);
					
					break;
				}
				case "Currency": {
					String currOptions = (String) JOptionPane.showInputDialog(null,
							"Select the currency conversion",
							"Currency",
							JOptionPane.INFORMATION_MESSAGE,
							null,
							new Object[] {/* "CAD to USD", "CAD to EUR", "USD to CAD","EUR to CAD"*/ "USD to EUR", "EUR to USD"},
							"CAD to USD");
					SelectorCurrencyConv.selection(currOptions);
					
					break;
				}
                case "Weight": {
					String weightOpt = (String) JOptionPane.showInputDialog(null,
							"Select the weight conversion",
							"Weight",
							JOptionPane.INFORMATION_MESSAGE,
							null,
							new Object[] {"kg to lb","kg to oz","lb to kg","lb to oz","oz to kg","oz to lb"},"kg to lb");
					SelectorWeightConv.selection(weightOpt);
					
					break;
				}
				default:
					break;
				}

			} else {
				break;
			}
			

			menu = JOptionPane.showConfirmDialog(null,"Do you want to continue?", "Alert", 
					JOptionPane.YES_NO_OPTION);
		} while (menu == 0);
	}

}

