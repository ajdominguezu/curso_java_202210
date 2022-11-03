package curso.java.inicio.ejercicioColecciones;

public class Asignatura {

	//Variables de instancia
	private String nombre;
	private int nota;
	
	//Constructor
	public Asignatura(String nombre, int nota) {
		super();
		this.nombre = nombre;
		this.nota = nota;
	}
	public Asignatura(String nombre) {
		super();
		this.nombre = nombre;;
	}

	//Getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	
}
