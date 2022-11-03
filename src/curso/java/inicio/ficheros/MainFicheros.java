package curso.java.inicio.ficheros;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import curso.java.inicio.ejercicioColecciones.Estudiante;
import curso.java.inicio.ficheros.servicio.ServicioFicheros;

public class MainFicheros {
	public static void main(String[] args) {
		MainFicheros main = new MainFicheros();
		
		System.out.println("Ejercicio 1: ");
		main.Ejercicio1();
		System.out.println("");
		
		System.out.println("Ejercicio 2: ");
		main.Ejercicio2();
		
	}
	/**
	 * Mostrar el Ejercicio 1
	 */
	private void Ejercicio1() {
		List<Estudiante> estudiantes = new ArrayList<Estudiante>();
		ServicioFicheros servicio = new ServicioFicheros();
		String rutaFichero = "./recursos/alumnos.txt";
		estudiantes=servicio.leerArchivoToListEj1(rutaFichero);
		System.out.println("Total de Estudiantes: "+estudiantes.size());
	}
	
	/**
	 * Mostrar el ejercicio 2
	 */
	private void Ejercicio2() {
		Map<String,List<Estudiante>> colegios = new HashMap<String,List<Estudiante>>();
		ServicioFicheros servicio = new ServicioFicheros();
		String rutaFichero = "./recursos/alumnos-colegio.txt";
		colegios=servicio.leerArchivoToMapEj2(rutaFichero);

		int maximoAlumnos = 0;
		int numAlumnos=0;
		String colegioMasAlumnos="";
		
		for (String colegio : colegios.keySet()) {
			numAlumnos=colegios.get(colegio).size();
			
			if(numAlumnos>maximoAlumnos) {
				maximoAlumnos=numAlumnos;
				colegioMasAlumnos=colegio;
			}
		}
		
		System.out.println("El colegio con mas alumnos es "+colegioMasAlumnos+" con "+maximoAlumnos);
		
	}
	
}
