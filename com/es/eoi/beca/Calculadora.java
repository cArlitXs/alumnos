package com.es.eoi.beca;

public class Calculadora {

	public static void main(String[] args) {

		Double resultado = (Double.parseDouble(args[0]) / Double.parseDouble(args[1]))
				* (Double.parseDouble(args[2]) / Double.parseDouble(args[3]));

		System.out.println(resultado);

	}

}
