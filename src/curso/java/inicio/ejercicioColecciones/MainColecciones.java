package curso.java.inicio.ejercicioColecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import curso.java.funciones.Utils;

public class MainColecciones {

	public static void main(String[] args) {
		MainColecciones main = new MainColecciones();
		Set<Estudiante> estudiantes = main.crearEstudiantes();
		
		main.mostrarEstudiantes(estudiantes);
		System.out.println("");
		main.mostrarSoloMatematicas(estudiantes);
		System.out.println("");
		main.mostrarSoloAprobados(estudiantes);
		System.out.println("");
		estudiantes=main.borrarSuspensoLengua(estudiantes);
		System.out.println("");
		main.mostrarEstudiantes(estudiantes);
	}

	/**
	 * Funcion para crear todos los estudiantes y meterlos en una colección
	 */
	private Set<Estudiante> crearEstudiantes() {
		Set<Estudiante> estudiantes=new HashSet<Estudiante>();
		
		List<Set<Asignatura>> asignaturasArr=new ArrayList<Set<Asignatura>>();
		//List<Asignatura> asignaturasArr=new ArrayList<Asignatura>();
		for (int i = 0; i < 5; i++) {
			Set<Asignatura> asignaturas=new HashSet<Asignatura>();
			asignaturas.add(new Asignatura("Matematicas",Utils.tiradaAleatoria(11)-1));
			asignaturas.add(new Asignatura("Fisica",Utils.tiradaAleatoria(11)-1));
			asignaturas.add(new Asignatura("Lengua",Utils.tiradaAleatoria(11)-1));
			asignaturasArr.add(i, asignaturas);
			
		}
		
		estudiantes.add(new Estudiante("Pepe","Caballero","65320106Z",asignaturasArr.get(0)));
		estudiantes.add(new Estudiante("Juan","Velazquez","32729872K",asignaturasArr.get(1)));
		estudiantes.add(new Estudiante("Antonio","Dominguez","70874510X",asignaturasArr.get(2)));
		estudiantes.add(new Estudiante("Maria","Dominguez","88205983V",asignaturasArr.get(3)));
		estudiantes.add(new Estudiante("Luisa","Duran","99789672D",asignaturasArr.get(4)));
		return estudiantes;
	}
	
	/**
	 * Funcion para mostrar todos los estudiantes del Set.
	 * @param estudiantes le pasamos el Set de Estudiante por parametro.
	 */
	private void mostrarEstudiantes(Set<Estudiante> estudiantes) {
		System.out.println("------------TODOS LOS ALUMNOS------------");
		for (Estudiante estudiante : estudiantes) {
			System.out.println("Nombre: "+estudiante.getNombre());
			System.out.println("Apellidos: "+estudiante.getApellidos());
			System.out.println("DNI: "+estudiante.getDNI());
			System.out.println("Asignaturas:");
			for (Asignatura asignatura: estudiante.getAsignaturas()) {
				System.out.print("Nombre: "+asignatura.getNombre()+", Nota: "+asignatura.getNota()+"\n");
			}
			System.out.println("====================");
		}
	}
	
	/**
	 * Funcion para mostrar solo los Estudiantes que han cursado Matematicas.
	 * @param estudiantes le pasamos el Set de Estudiante por parametro.
	 */
	private void mostrarSoloMatematicas(Set<Estudiante> estudiantes) {
		System.out.println("------------SOLO CURSADO MATEMATICAS------------");
		for (Estudiante estudiante : estudiantes) {
			for(Asignatura asignatura : estudiante.getAsignaturas()) {
				if(asignatura.getNombre().equals("Matematicas")) {
					System.out.println("Nombre: "+estudiante.getNombre());
					System.out.println("Apellidos: "+estudiante.getApellidos());
					System.out.println("====================");
				}
			}
		}
	}
	
	/**
	 * Funcion para mostrar solo los que han aprobado el curso.
	 * @param estudiantes le pasamos el Set de Estudiante por parametro.
	 */
	private void mostrarSoloAprobados(Set<Estudiante> estudiantes) {
		int nota=0;
		double notamedia=0;
		
		System.out.println("------------SOLO APROBADOS------------");
		for (Estudiante estudiante : estudiantes) {
			for(Asignatura asignatura : estudiante.getAsignaturas()) {
				nota+=asignatura.getNota();
			}
			notamedia=nota/estudiante.getAsignaturas().size();
			nota=0;
			if(notamedia>=5) {
				System.out.println("Nombre: "+estudiante.getNombre());
				System.out.println("Apellidos: "+estudiante.getApellidos());
				System.out.println("DNI: "+estudiante.getDNI());
				System.out.println("Nota media: "+notamedia);
			}
			
		}
	}
	
	/**
	 * Funcion para borrar el Estudiante que haya suspendido Lengua del Set
	 * @param estudiantes le pasamos el Set de Estudiante por parametro.
	 * @return devuelve el Set de Estudiantes con los cambios ya realizados (borrado).
	 */
	private Set<Estudiante> borrarSuspensoLengua(Set<Estudiante> estudiantes){
		Set<Estudiante> aBorrar=new HashSet<Estudiante>();
		
		for (Estudiante estudiante : estudiantes) {
			for(Asignatura asignatura : estudiante.getAsignaturas()) {
				if(asignatura.getNombre().equals("Lengua") && asignatura.getNota()<5) {
				aBorrar.add(estudiante);
				}
			}
		}
		estudiantes.removeAll(aBorrar);
		
		System.out.println("Los estudiantes con Lengua suspendido se ha borrado correctamente.");
		return estudiantes;
	}
}
