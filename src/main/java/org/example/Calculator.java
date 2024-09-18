package org.example;

import java.util.List;

/**
 * Class for mathematics calculations
 * 
 */
public class Calculator {
	
	public final static String EMPTY = "vacio";

	/**
	 * Calculates multiplication of two Integer parameters
	 * 
	 * @param a The first parameter
	 * @param b The second parameter
	 * @return The result of multiplying a by b 
	 */
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public String concat(String a, String b) {
    	if(b!=null && a !=null) {
    		return a+b;
    	} else if(a!=null){
    		return a;
    	} else {
    		return b;
    	}
    }

	public double calcularSumatorio(List<Double> precios){
		double total = 0;
		for(Double numero: precios){
			if(numero!=null && !numero.isNaN()) {
				total = total + numero;
			}
		}
		return total;
	}
    
    public String concat2(String a, String b) {
    	if(b!=null && a !=null) {
    		return a.concat(b);
    	} else {
    		return EMPTY;
    	}
    }
}