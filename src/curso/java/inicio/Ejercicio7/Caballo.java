package curso.java.inicio.Ejercicio7;

import curso.java.funciones.Utils;

public class Caballo {

	//Variables de instancias
	private int dorsal,velocidad,experiencia,edad,distanciaTotalAvanzada;
	private String nombre;
	
	//Constructor
	public Caballo(int dorsal, int velocidad, int experiencia, int edad, String nombre) {
		super();
		this.dorsal = dorsal;
		this.velocidad = velocidad;
		this.experiencia = experiencia;
		this.edad = edad;
		this.nombre = nombre;
		//this.distanciaTotalAvanzada=distanciaTotalAvanzada;
	}
	
	//Getter y setter
	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getDistanciaTotalAvanzada() {
		return distanciaTotalAvanzada;
	}

	public void setDistanciaTotalAvanzada(int distanciaTotalAvanzada) {
		this.distanciaTotalAvanzada = distanciaTotalAvanzada;
	}

	//Funciones
	public int correr() {
		int random = Utils.tiradaAleatoria(10);
		int avance=velocidad+experiencia-edad+random;
		this.distanciaTotalAvanzada+=avance;
		System.out.println("El caballo "+this.dorsal+" ha avanzado "+avance+" lleva en total "+distanciaTotalAvanzada);
		return avance;
	}
}
