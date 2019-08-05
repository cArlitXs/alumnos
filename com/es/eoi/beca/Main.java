package com.es.eoi.beca;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.es.eoi.beca.Persona;

public class Main {

	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		p1.setNombre("Ana");
		p1.setEdad(26);
		p1.setAnyo(2010);
		
		Persona p2 = new Persona();
		p2.setNombre("Alba");
		p2.setEdad(21);
		p2.setAnyo(1988);
		
		Persona p3 = new Persona();
		p3.setNombre("Ana");
		p3.setEdad(26);
		p3.setAnyo(2009);
		
		Persona p4 = new Persona();
		p4.setNombre("Alba");
		p4.setEdad(26);
		p4.setAnyo(2007);

		Persona per[] = {p1,p2,p3,p4};
		
		List<Persona> personas = Arrays.asList(per);

		for(Persona p : personas) {
			System.out.println(p.getNombre() + ", " + p.getEdad() + ", " + p.getAnyo() );
		}

		System.out.println("-----------------------------------");
		
		Collections.sort(personas);
		
		for(Persona p : personas) {
			System.out.println(p.getNombre() + ", " + p.getEdad() + ", " + p.getAnyo() );
		}

	}

}
