package com.es.eoi.beca;

public class ImprimirTipoDato {

	public static void main(String[] args) {
		
		Persona dato1 = new Persona();

		Persona dato2 = new Persona();
		
		dato2.nombre = "JJ";
		
		Persona[] datos = new Persona[2];
		datos[0] = dato1;
		datos[1] = dato2;
		
		imprimirTodos(datos);
		
//		System.out.println(
//				"Hola me llamo " +
//				dato1.nombre + " " +
//				dato1.apellidos +
//				" y tengo " +
//				dato1.edad + 
//				" años\nNací el " + 
//				dato1.dia + "/" + dato1.mes + "/" + dato1.anyo + 
//				" y vivo en " +
//				dato1.ciudad
//				);

	}
	
	public static void imprimirTodos(Persona[] datos) {
		
		for (int i = 0; i < datos.length; i++) {
			System.out.println(datos[i].nombre);
		}
		
	}

}
