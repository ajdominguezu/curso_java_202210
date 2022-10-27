package curso.java.inicio.Ejercicio8;

public class Guitarra extends Instrumento {

	//Variables de instancia
	private int numCuerdas;
	private String material;
	
	//Constructor
	public Guitarra(String nombre, String tipo, String marca, double precio, int numCuerdas, String material) {
		super(nombre, tipo, marca, precio);
		this.numCuerdas = numCuerdas;
		this.material = material;
	}

	//Getters y setters
	public int getNumCuerdas() {
		return numCuerdas;
	}

	public void setNumCuerdas(int numCuerdas) {
		this.numCuerdas = numCuerdas;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	//Funciones
	@Override
	public void tocar() {
		
		if(isAfinado()) {
			System.out.println("Se esta tocando la guitarra bien.");
		}else {
			System.out.println("Se esta tocando la guitarra mal.");
		}
	}

	@Override
	public String toString() {
		return "Guitarra [numCuerdas=" + numCuerdas + ", material=" + material + ", " + super.toString()
				+ "]";
	}
	
	
	
	
	
	
}
