package com.es.eoi.beca;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Diario {
	
	static String separator = "-----------------------------------------";

	public static void main(String[] args) throws IOException {

		String inputString;
		String exitValue = "FIN";

		do {
			System.out.println("Aplicación para escribir tu propio diario");
			System.out.println(separator);
			
			System.out.println("1. Escribir diario");
			System.out.println("2. Leer diario");

			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			inputString = scanner.nextLine();

			if (inputString.compareTo("1") == 0 || inputString.compareTo("2") == 0) {

				if (inputString.compareTo("1") == 0) {

					System.out.println("¿Cómo se llama el fichero?");

					scanner = new Scanner(System.in);
					String fileName = scanner.nextLine();

					System.out.println("Escriba texto:");

					inputString = scanner.nextLine() + "\n";

					escribir(inputString, fileName);

				} else {
					System.out.println("¿Qué fichero desea leer?");

					scanner = new Scanner(System.in);
					String fileName = scanner.nextLine();

					leer(fileName);
					System.out.println(separator);
				}
			}

			if (inputString.compareTo(exitValue) == 0) {
				System.out.println("Good bye!");
			}

		} while (inputString.compareTo(exitValue) != 0);

	}

	public static void escribir(String texto, String fileName) throws IOException {
		
		FileWriter fw = new FileWriter(fileName, true);
		fw.write(texto);
		fw.close();
		
	}

	public static void leer(String fileName) throws IOException {
		
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		
		System.out.println("Esto es lo que contiene el fichero " + fileName + ":");
		System.out.println("Linea\tTexto");
		System.out.println(separator);

		int i = 1;
		while (line != null) {
			System.out.println(i + "\t" + line);
			line = br.readLine();
			
			i++;
		}
		
		br.close();
		
	}

}
