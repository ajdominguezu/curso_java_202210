package curso.java.inicio.Ejercicio8;

public class Bateria extends Instrumento {

	//Variables de instancia
	private int numTimbales,numPlatos;

	//Constructor
	public Bateria(String nombre, String tipo, String marca, double precio, int numTimbales, int numPlatos) {
		super(nombre, tipo, marca, precio);
		this.numTimbales = numTimbales;
		this.numPlatos = numPlatos;
	}

	//Getters y setters
	public int getNumTimbales() {
		return numTimbales;
	}

	public void setNumTimbales(int numTimbales) {
		this.numTimbales = numTimbales;
	}

	public int getNumPlatos() {
		return numPlatos;
	}

	public void setNumPlatos(int numPlatos) {
		this.numPlatos = numPlatos;
	}
	
	//Funciones
	public void aporrear() {
		System.out.println("Se esta aporreando la bateria "+this.getNombre());
	}

	@Override
	public String toString() {
		return "Bateria [numTimbales=" + numTimbales + ", numPlatos=" + numPlatos + ", " + super.toString()
				+ "]";
	}
	
	
	
}
