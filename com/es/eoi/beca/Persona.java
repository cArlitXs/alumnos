package com.es.eoi.beca;

public class Persona implements Comparable<Persona> {

//	String nombre = "Carlos";
//	String apellidos = "Alvarez Linares";
//	Integer dia = Integer.valueOf(11);
//	Integer mes = Integer.valueOf(01);
//	Integer anyo = Integer.valueOf(1993);
//	String ciudad = "Alicante";
//	Integer edad = Integer.valueOf(26);
//	Boolean estudias = Boolean.TRUE;
//	Boolean trabajas = Boolean.FALSE;
//	String genero = "H";

	private String dni;
	private String nombre;
	private String apellidos;
	private Integer dia;
	private Integer mes;
	private Integer anyo;
	private String ciudad;
	private Integer edad;
	private Boolean estudias;
	private Boolean trabajas;
	private String genero;
	private Double nota;
	private Calificaciones calificaion;
	
	public Calificaciones getCalificaion() {
		return calificaion;
	}

	public void setCalificaion(Calificaciones calificacionStatus) {
		this.calificaion = calificacionStatus;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getAnyo() {
		return anyo;
	}

	public void setAnyo(Integer anyo) {
		this.anyo = anyo;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Boolean getEstudias() {
		return estudias;
	}

	public void setEstudias(Boolean estudias) {
		this.estudias = estudias;
	}

	public Boolean getTrabajas() {
		return trabajas;
	}

	public void setTrabajas(Boolean trabajas) {
		this.trabajas = trabajas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	
//	public int compareTo(Persona o) {
//
//		int valor = this.getNombre().compareTo(o.getNombre());
//
//		if (valor == 0) {
//			if (this.getEdad().equals(o.getEdad())) {
//				if (this.getAnyo().equals(o.getAnyo())) {
//					return 0;
//				} else if (this.getAnyo() > o.getAnyo()) {
//					return 1;
//				} else {
//					return -1;
//				}
//			} else if (this.getEdad() < o.getEdad()) {
//				return 1;
//			} else {
//				return -1;
//			}
//		} else {
//			return valor;
//		}
//
//	}
	
	public int compareTo(Persona o) {
		return 0;
	}

}
