package com.es.eoi.beca;

public class Tablero {

	public static void main(String[] args) {
		
		generarTablero(3,3);
		
	}
	
	public static int[][] generarTablero(int x, int y){
		
		Integer numeroX;
		Integer numeroY;
		
		for (int i = 0; i < y; i++) {
			numeroX = Integer.valueOf(i);
			for (int j = 0; j < x; j++) {
				numeroY = Integer.valueOf(j);
				
				System.out.println(numeroX + "," + numeroY);
			}
			
		}
		return null;
	}

}
