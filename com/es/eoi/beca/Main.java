package com.es.eoi.beca;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import com.es.eoi.beca.Calificaciones;

public class Main {

	public static void main(String[] args) throws IOException {

//		EJERCICIO 1

//		Persona p1 = new Persona();
//		p1.setDni("123456789");
//		p1.setNombre("Ana");
//		p1.setEdad(26);
//		p1.setAnyo(2010);
//		
//		Persona p2 = new Persona();
//		p2.setDni("987654321");
//		p2.setNombre("Alba");
//		p2.setEdad(21);
//		p2.setAnyo(1988);
//		
//		Persona p3 = new Persona();
//		p3.setDni("456123789");
//		p3.setNombre("Ana");
//		p3.setEdad(26);
//		p3.setAnyo(2009);
//		
//		Persona p4 = new Persona();
//		p4.setDni("321654987");
//		p4.setNombre("Alba");
//		p4.setEdad(26);
//		p4.setAnyo(2007);
//
//		Persona per[] = {p1,p2,p3,p4};
//		
//		List<Persona> personas = Arrays.asList(per);
//
//		for(Persona p : personas) {
//			System.out.println(p.getNombre() + ", " + p.getEdad() + ", " + p.getAnyo() );
//		}
//
//		System.out.println("-----------------------------------");
//		
//		Collections.sort(personas);
//		
//		for(Persona p : personas) {
//			System.out.println(p.getNombre() + ", " + p.getEdad() + ", " + p.getAnyo() );
//		}

//		EJERCICIO 2

//		HashMap<String, Persona> personas = new HashMap<String, Persona>();
//		
//		personas.put(p1.getDni(), p1);
//		personas.put(p2.getDni(), p2);
//		personas.put(p3.getDni(), p3);
//		personas.put(p4.getDni(), p4);
//		
//		System.out.println(personas.keySet());
//		
//		System.out.println("-------------------------------");
//		
//		for (Persona p : personas.values()) {
//			System.out.println(p.getDni() + ", " + p.getNombre() + ", " + p.getEdad() + ", " + p.getAnyo());
//		}

//		EJERCICIO 3

//		String cadena = "Esto es una prueba";
//		System.out.println(cadena.toUpperCase());
//		System.out.println("------------------------");
//
//		String cadena2 = "La clase String, tiene varios métodos, muy útiles, como saber su longitud, trocear la cadena, etc";
//		String cadenaArray[] = cadena2.split(", ");
//
//		for (String p : cadenaArray) {
//			System.out.println(p);
//		}
//		System.out.println("------------------------");
//
//		String cadena3 = "Esto es un ejemplo usado para determinar un indice";
//		System.out.println(cadena3.indexOf("ejemplo"));
//		System.out.println("------------------------");
//
//		System.out.println(muestraFecha("11/01/1993"));
//		System.out.println("------------------------");
//
//		String inputString;
//		do {
//			System.out.print("Escriba un texto ");
//			Scanner scanner = new Scanner(System.in);
//			inputString = scanner.nextLine();
//			System.out.println(inputString);
//		} while (inputString.compareTo("exit") != 0);

//		EJERCICIO 4

//		String inputString;
//		String nombreAlumno;
//		Calificaciones calificacionStatus = null;
//		Double calificacionAlumno;
//		List<Persona> alumnosList = new ArrayList<Persona>();
//
//		do {
//			System.out.println("1. Nueva calificación");
//			System.out.println("2. Listar calificaciones");
//			Scanner scanner = new Scanner(System.in);
//			inputString = scanner.nextLine();
//
//			if (inputString.compareTo("1") == 0 || inputString.compareTo("2") == 0) {
//
//				if (inputString.compareTo("1") == 0) {
//
//					Persona alumnox = new Persona();
//
//					System.out.println("Escriba el nombre del alumno:");
//					Scanner alumno = new Scanner(System.in);
//					nombreAlumno = alumno.nextLine();
//
//					alumnox.setNombre(nombreAlumno);
//
//					System.out.println("Ingrese la calificación:");
//					Scanner cal = new Scanner(System.in);
//					calificacionAlumno = Double.parseDouble(cal.nextLine());
//
//					alumnox.setNota(calificacionAlumno);
//
//					getStatus();
//
//					if (calificacionAlumno >= 0 && calificacionAlumno <= 10) {
//						if (calificacionAlumno >= 5) {
//							alumnox.setCalificaion(calificacionStatus.NOTABLE);
//						} else {
//							alumnox.setCalificaion(calificacionStatus.INSUFICIENTE);
//						}
//
//						alumnosList.add(alumnox);
//
//						System.out.println("Guardado corractamente!");
//
//					} else {
//						System.out.println("Error!");
//					}
//
//				}
//				if (inputString.compareTo("2") == 0) {					
//
//					System.out.println("Lista de alumnos:");
//
//					for (Persona p : alumnosList) {
//						System.out.println(p.getNombre() + "\t\t" + p.getNota() + "\t" + p.getCalificaion());
//					}
//
//				}
//
//			} else {
//				System.out.println("Se ha terminado la ejecución");
//			}
//
//			System.out.println("--------------------------------");
//		} while (inputString.compareTo("1") == 0 || inputString.compareTo("2") == 0);

//		EJERCICIO 5

//		String inputString;
//
//		do {
//			System.out.println("1. Escribir diario");
//			System.out.println("2. Leer diario");
//			Scanner scanner = new Scanner(System.in);
//			inputString = scanner.nextLine();
//
//			if (inputString.compareTo("1") == 0 || inputString.compareTo("2") == 0) {
//
//				if (inputString.compareTo("1") == 0) {
//					
//					System.out.println("Escriba texto:");
//					inputString = scanner.nextLine() + "\n";
//
//					escribir(inputString, "diario.txt");
//
//				} else {
//					leer("diario.txt");
//				}
//			}
//
//		} while (inputString.compareTo("FIN") != 0);

	}
	
//	public static void escribir(String texto, String fileName) throws IOException{
//		FileWriter fw = new FileWriter(fileName, true);
//		fw.write(texto);
//		fw.close();
//	}
//	
//	public static void leer(String fileName) throws IOException{
//		FileReader fr = new FileReader(fileName);
//		BufferedReader br = new BufferedReader(fr);
//		String line = br.readLine(); 
//		while(line != null) {
//			System.out.println(line);
//			line = br.readLine();
//		}
//		br.close();
//	}

	private static Calificaciones status;

	public static Calificaciones getStatus() {
		return status;
	}

	public static String muestraFecha(String args) {
		Pattern pat = Pattern.compile("[0-9]{2}[/][0-9]{2}[/][0-9]{4}");
		Matcher mat = pat.matcher(args);

		if (mat.matches()) {
			String dia = args.substring(0, 2);
			String mes = args.substring(3, 5);
			String anyo = args.substring(6, 10);

			String mesTexto;

			switch (mes) {
			case "01":
				mesTexto = "Enero";
				break;
			case "02":
				mesTexto = "Febrero";
				break;
			case "03":
				mesTexto = "Marzo";
				break;
			case "04":
				mesTexto = "Abril";
				break;
			case "05":
				mesTexto = "Mayo";
				break;
			case "06":
				mesTexto = "Junio";
				break;
			case "07":
				mesTexto = "Julio";
				break;
			case "08":
				mesTexto = "Agosto";
				break;
			case "09":
				mesTexto = "Setiembre";
				break;
			case "10":
				mesTexto = "Octubre";
				break;
			case "11":
				mesTexto = "Noviembre";
				break;
			case "12":
				mesTexto = "Diciembre";
				break;
			default:
				mesTexto = "Error!";
				break;
			}

			return "Es el " + dia + " de " + mesTexto + " del " + anyo;
		} else {
			return "La fecha '" + args + "' no tiene el formato correcto";
		}

	}

}
