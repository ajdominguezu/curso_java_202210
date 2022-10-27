package curso.java.inicio.Ejercicio6;

/**
 * Clase que representa a un objeto de tipo boton
 * @author antonio
 *
 */
public class Boton {

	//Variables de instancia
	private String color,forma;

	//Constructor
	public Boton(String color, String forma) {
		super();
		this.color = color;
		this.forma = forma;
	}

	//getters y setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}
	
	
	
}
