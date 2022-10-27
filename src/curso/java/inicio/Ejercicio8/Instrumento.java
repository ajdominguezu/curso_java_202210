package curso.java.inicio.Ejercicio8;

import curso.java.funciones.Utils;

public class Instrumento {

	//Variables de instancia
	private String nombre,tipo,marca;
	private double precio;
	private boolean afinado;
	
	//Constructor
	public Instrumento(String nombre, String tipo, String marca, double precio) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.marca = marca;
		this.precio = precio;
	}

	//Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public boolean isAfinado() {
		return afinado;
	}

	//Funciones
	public void afinar() {
		int aleatorio;
		aleatorio=Utils.tiradaAleatoria(10);
		if (aleatorio>8) {
			this.afinado=false;
			System.out.println("Instrumento "+this.nombre+" no afinado.");
		}else {
			this.afinado=true;
			System.out.println("Instrumento "+this.nombre+" afinado.");
		}
	}
	
	public void tocar() {
		if (this.afinado) {
			System.out.println("El instrumento "+this.nombre+" esta tocando correctamente.");
		}else {
			System.out.println("El instrumento "+this.nombre+" esta sonando mal.");
		}
	}

	@Override
	public String toString() {
		return "Instrumento [nombre=" + nombre + ", tipo=" + tipo + ", marca=" + marca + ", precio=" + precio
				+ ", afinado=" + afinado + "]";
	}
	
	
	
}
