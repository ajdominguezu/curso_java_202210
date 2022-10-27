package curso.java.inicio.Ejercicio6;

/**
 * Clase que representa una objeto de tipo Vestido
 * @author anton
 *
 */
public class Vestido {
	//Variables de instancia
	private String color,talla;
	private double precio;
	
	//Constructor
	public Vestido(String color, String talla, double precio) {
		super();
		this.color = color;
		this.talla = talla;
		this.precio = precio;
	}

	//Getters y setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
}
