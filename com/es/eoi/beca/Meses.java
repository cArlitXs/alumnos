package com.es.eoi.beca;

public class Meses {

	public static void main(String[] args) {
		
//		String[] meses = new String[12];
//		meses[0] = "Enero";
//		meses[1] = "Febrero";
//		meses[2] = "Marzo";
//		meses[3] = "Abril";
//		meses[4] = "Mayo";
//		meses[5] = "Junio";
//		meses[6] = "Julio";
//		meses[7] = "Agosto";
//		meses[8] = "Setiembre";
//		meses[9] = "Octubre";
//		meses[10] = "Noviembre";
//		meses[11] = "Diciembre";
		
		String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Setiembre","Octubre","Noviembre","Diciembre"};
		
		
		for (int i = 0; i < meses.length; i++) {
			System.out.println("El " + (i + 1) + "º mes del año es " + meses[i]);
		}
		
	}

}
