package curso.java.inicio.Ejercicio8;

public class GuitarraElectrica extends Guitarra {

	//Variables de instancia
	private int potencia;

	//Constructor
	public GuitarraElectrica(String nombre, String tipo, String marca, double precio, int numCuerdas, String material,
			int potencia) {
		super(nombre, tipo, marca, precio, numCuerdas, material);
		this.potencia = potencia;
	}

	//Getters y setters
	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public void tocar() {
		
		if(isAfinado()) {
			System.out.println("Se esta tocando la guitarra electrica bien, con una potencia de "+this.potencia);
		}else {
			System.out.println("Se esta tocando la guitarra electrica mal, con una potencia de "+this.potencia);
		}
	}

	@Override
	public String toString() {
		return "GuitarraElectrica [potencia=" + potencia + ", " + super.toString() + "]";
	}

	
	
	
	
}
