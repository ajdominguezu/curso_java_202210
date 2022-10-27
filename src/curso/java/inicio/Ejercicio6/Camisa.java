package curso.java.inicio.Ejercicio6;

/**
 * Clase que representa a un objeto de tipo camisa
 * @author antonio
 *
 */
public class Camisa {
	//Variables de instancia
	 private String color,talla;
	 private double precio;
	 private Boton [] botones;
	 
	 //Constructor
	public Camisa(String color, String talla, double precio, Boton[] botones) {
		super();
		this.color = color;
		this.talla = talla;
		this.precio = precio;
		this.botones = botones;
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

	public Boton[] getBotones() {
		return botones;
	}

	public void setBotones(Boton[] botones) {
		this.botones = botones;
	}
	
	
	 
	 
}
