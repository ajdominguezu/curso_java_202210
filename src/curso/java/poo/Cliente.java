package curso.java.poo;

public class Cliente {
	//Variables de clase
	static String saludo;
	//Variables de instancia
	private String nombre,apellidos,dni;
	private double importeCompra;
	
	//Constructor
	public Cliente(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.importeCompra = 0;
	}
	//Getter y setter
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

	public String getDni() {
		return dni;
	}
	
	public double getImporteCompra() {
		return importeCompra;
	}
	
	//Funciones
	public void comprar(double importe) {
		this.importeCompra+=importe;
	}
	
}
