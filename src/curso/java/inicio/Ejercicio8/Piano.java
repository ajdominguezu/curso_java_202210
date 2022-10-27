package curso.java.inicio.Ejercicio8;

public class Piano extends Instrumento {

	//Variables de instancia
	private int numOctavas,numPedales;

	//Constructor
	public Piano(String nombre, String tipo, String marca, double precio, int numOctavas, int numPedales) {
		super(nombre, tipo, marca, precio);
		this.numOctavas = numOctavas;
		this.numPedales = numPedales;
	}

	//Getters y setters
	public int getNumOctavas() {
		return numOctavas;
	}

	public void setNumOctavas(int numOctavas) {
		this.numOctavas = numOctavas;
	}

	public int getNumPedales() {
		return numPedales;
	}

	public void setNumPedales(int numPedales) {
		this.numPedales = numPedales;
	}

	//Funciones
	@Override
	public String toString() {
		return "Piano [numOctavas=" + numOctavas + ", numPedales=" + numPedales + ", " + super.toString()
				+ "]";
	}
	
	
	
}
