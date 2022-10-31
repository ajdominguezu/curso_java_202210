package curso.java.inicio.ejercicioColecciones;

public abstract class Persona {

	//Variables de instancia
	private String nombre,apellidos,DNI;

	//Constructor
	public Persona(String nombre, String apellidos, String dNI) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		DNI = dNI;
	}

	//Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}
	
	
	
}
