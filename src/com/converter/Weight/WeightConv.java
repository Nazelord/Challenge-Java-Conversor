package com.converter.Weight;

import javax.swing.JOptionPane;

public class WeightConv {

	
	public static void kgtolb(double input) {
		double lb = input * 2.205;
		JOptionPane.showMessageDialog(null, lb +" lb");
	}

	public static void kgtooz(double input) {
		double oz = input * 35.274;
		JOptionPane.showMessageDialog(null, oz +" oz");
	}
	
	public static void lbtokg(double input) {
		double kg = input / 2.205;
		JOptionPane.showMessageDialog(null, kg +" kg");
	}
	
	public static void lbtooz(double input) {
		double oz = input * 16;
		JOptionPane.showMessageDialog(null, oz +" oz");
	}
	
	public static void oztokg(double input) {
		double kg = input / 35.274;
		JOptionPane.showMessageDialog(null, kg +" kg");
	}
	
	public static void oztolb(double input) {
		double lb = input / 16;
		JOptionPane.showMessageDialog(null, lb +" lb");
	}
	
	
}