package com.converter.Temperature;

import javax.swing.JOptionPane;

public class TempConv {

	
	public static void CtoF(double input) {
		double cAux = (double) input*9/5+32;
		double f = (double) Math.round(cAux*100)/100;
		JOptionPane.showMessageDialog(null, f +" ºF");
	}

	public static void FtoC(double input) {
		double fAux = (double) (input-32)*5/9;
		double c = (double) Math.round(fAux*100)/100;
		JOptionPane.showMessageDialog(null, c +" ºC");
	}
	
	public static void CtoK(double input) {
		double fAux = (double) (input+273.15);
		double f = (double) Math.round(fAux*100)/100;
		JOptionPane.showMessageDialog(null, f +" K");
	}
	
	public static void FtoK(double input) {
		double fAux = (double) (input-32)*5/9+273.15;
		double f = (double) Math.round(fAux*100)/100;
		JOptionPane.showMessageDialog(null, f +" ºF");
	}
	
	public static void KtoC(double input) {
		double fAux = (double) (input-273.15);
		double f = (double) Math.round(fAux*100)/100;
		JOptionPane.showMessageDialog(null, f +" ºC");
	}
	
	public static void KtoF(double input) {
		double fAux = (double) (input-273.15)*5/9+32;
		double f = (double) Math.round(fAux*100)/100;
		JOptionPane.showMessageDialog(null, f +" ºF");
	}
	
	
}
