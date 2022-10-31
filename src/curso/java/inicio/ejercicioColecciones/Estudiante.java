package curso.java.inicio.ejercicioColecciones;

import java.util.Set;

public class Estudiante extends Persona {

	//Variables de instancia
	private Set<Asignatura> asignaturas;

	//Constructor
	public Estudiante(String nombre, String apellidos, String dNI, Set<Asignatura> asignaturas) {
		super(nombre, apellidos, dNI);
		this.asignaturas = asignaturas;
	}

	//Getter y setter
	public Set<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Set<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}

	
	
	
}
