package com.converter.Currency;

import javax.swing.JOptionPane;
import org.json.simple.*;
import com.converter.connection.*;

public class CurrencyConv {

    //private static double USD = apiCurrencyUSD()
	private static double EUR = apiCurrencyEUR();
	
	
	private static double apiCurrencyEUR() {
		String ans = null;
		try (Connection conexion = new Connection("https://exchange-rates.abstractapi.com/v1/live/?api_key=cd0a504d10e1420ba90eaebe13f7f1db&base=USD&target=EUR")) {
			  ans = conexion.readAnswer();
			} catch (Exception e) {
				e.printStackTrace();
			}
		JSONObject array = (JSONObject) JSONValue.parse(ans);
		JSONObject eur = (JSONObject) array.get("exchange_rates");
	    EUR = (Double) eur.get("EUR");
		return EUR;
	}
	
	/*public static void deUSDaARS(double input) {
		double arsAux = (double) input*arsXusd;
		double ars = (double) Math.round(arsAux*100)/100;
		JOptionPane.showMessageDialog(null, ars +" ARS");
	}*/

	/*public static void deARSaUSD(double input) {
		double usdAux = (double) input/arsXusd;
		double usd = (double)(Math.round(usdAux*100))/100;
		JOptionPane.showMessageDialog(null, usd +" USD");
	}*/
	
	public static void USDtoEUR(double input) {
		double eurAux = (double) input*EUR;
		double eur = (double) Math.round(eurAux*100)/100;
		JOptionPane.showMessageDialog(null, eur +" EUR");
	}

	public static void EURtoUSD(double input) {
		double usdAux = (double) input/EUR;
		double usd = (double)(Math.round(usdAux*100))/100;
		JOptionPane.showMessageDialog(null, usd +" USD");
	}
	
	/*public static void deARSaEUR(double input) {
		double eurAux = (double)(input/arsXusd)*eurXusd;
		double eur = (double)(Math.round(eurAux*100))/100;
		JOptionPane.showMessageDialog(null, eur +" EUR");
	}*/
	
	/*public static void deEURaARS(double input) {
		double arsAux = (double) (input/eurXusd)*arsXusd;
		double ars = (double)(Math.round(arsAux*100))/100;
		JOptionPane.showMessageDialog(null, ars +" ARS");
*/

}
