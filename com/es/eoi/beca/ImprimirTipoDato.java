package com.es.eoi.beca;

public class ImprimirTipoDato {

	public static void main(String[] args) {
		
		TipoDatos dato1 = new TipoDatos();

		TipoDatos dato2 = new TipoDatos();
		
		dato2.nombre = "JJ";
		
		TipoDatos[] datos = new TipoDatos[2];
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
	
	public static void imprimirTodos(TipoDatos[] datos) {
		
		for (int i = 0; i < datos.length; i++) {
			System.out.println(datos[i].nombre);
		}
		
	}

}
