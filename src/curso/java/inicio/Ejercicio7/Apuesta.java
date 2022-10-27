package curso.java.inicio.Ejercicio7;

public class Apuesta {
	
	//Variables de instancia
	private double cantidad;
	private int dorsal;
	
	//Constructor
	public Apuesta(double cantidad, int dorsal) {
		super();
		this.cantidad = cantidad;
		this.dorsal = dorsal;
	}

	//Getters y setters
	public double getCantidad() {
		return cantidad;
	}

	public int getDorsal() {
		return dorsal;
	}

	
}
