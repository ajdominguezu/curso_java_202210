package curso.java.inicio.Ejercicio6;

/**
 * Clase que representa a una clase de objeto pantalon
 * @author antonio
 *
 */
public class Pantalon {

	//Variables de instancia
	private String color,talla;
	private double precio;
	private Boton boton;
	
	//Constructor
	public Pantalon(String color, String talla, double precio, Boton boton) {
		super();
		this.color = color;
		this.talla = talla;
		this.precio = precio;
		this.boton = boton;
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

	public Boton getBoton() {
		return boton;
	}

	public void setBoton(Boton boton) {
		this.boton = boton;
	}
	
	
	
	
}
