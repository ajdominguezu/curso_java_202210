package curso.java.inicio.ficheros.servicio;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import curso.java.funciones.Utils;
import curso.java.inicio.ejercicioColecciones.Asignatura;
import curso.java.inicio.ejercicioColecciones.Estudiante;

public class ServicioFicheros {

	/**
	 * Función para leer un fichero y devolver una lista de Estudiantes (contenida en el fichero)
	 * @param nombre ruta del archivo
	 * @return devuelve la lista con todos los alumnos ya metidos.
	 */
	public List<Estudiante> leerArchivoToListEj1(String nombre){
        List<Estudiante> estudiantes = new ArrayList<Estudiante>();
        String string,nombreAlumno,apellidoAlumno,DNIAlumno;
        File archivo = new File(nombre);
        try (Scanner s = new Scanner(archivo)){

            s.useDelimiter("\n");
            while (s.hasNext()){
            	string=s.next();
            	String[] splitted = string.split("\\|");
            	nombreAlumno=splitted[0];
            	apellidoAlumno=splitted[1];
            	DNIAlumno=splitted[2];
            	String[] asignArr = splitted[3].split("\\;");
            	Set<Asignatura> asignaturas = new HashSet<Asignatura>();
            	for (String asignaturaNombre : asignArr) {
					asignaturas.add(new Asignatura(asignaturaNombre,Utils.tiradaAleatoria(10)));
				}
            	
   
                estudiantes.add(new Estudiante(nombreAlumno, apellidoAlumno, DNIAlumno, asignaturas));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return estudiantes;
    }
	
	/**
	 * Función para leer un archivo y almacenarlo en un mapa segun su colegio al que este asignado (contenido en el fichero)
	 * @param nombre ruta del archivo
	 * @return Devuelve el mapa con toda la información.
	 */
	public Map<String,List<Estudiante>> leerArchivoToMapEj2(String nombre){
		Map<String,List<Estudiante>> colegios = new HashMap<String,List<Estudiante>>();
        String string,nombreColegio,nombreAlumno,apellidoAlumno,DNIAlumno;
        File archivo = new File(nombre);
        try (Scanner s = new Scanner(archivo)){

            s.useDelimiter("\n");
            while (s.hasNext()){
            	string=s.next();
            	String[] splitted = string.split("\\|");
            	nombreColegio=splitted[0];
            	nombreAlumno=splitted[1];
            	apellidoAlumno=splitted[2];
            	DNIAlumno=splitted[3];
            	String[] asignArr = splitted[4].split("\\;");
            	Set<Asignatura> asignaturas = new HashSet<Asignatura>();
            	for (String asignaturaNombre : asignArr) {
					asignaturas.add(new Asignatura(asignaturaNombre,Utils.tiradaAleatoria(10)));
				}
            	
//            	colegios.put(nombreColegio, estudiantes = new ArrayList<Estudiante>());
//              estudiantes.add(new Estudiante(nombreAlumno, apellidoAlumno, DNIAlumno, asignaturas));
            	
            	//POR CADA LINEA HACEMOS UN NUVEO ESTUDIANTE
                Estudiante estudiante = new Estudiante(nombreAlumno, apellidoAlumno, DNIAlumno, asignaturas);
                
                //MIRAMOS SI EL COLEGIO ESTA EN EL MAPA
                if(colegios.containsKey(nombreColegio)) {
                	colegios.get(nombreColegio).add(estudiante);
                }else {//EL COLEGIO NO ESTA EN EL MAPA, SE AÑADE NUEVO
                	List<Estudiante> listaEstudiantes=new ArrayList<Estudiante>();
                	listaEstudiantes.add(estudiante);
                	colegios.put(nombreColegio, listaEstudiantes);
//                	colegios.put(nombreColegio, Arrays.asList(estudiante));
                }
                
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return colegios;
	}
}
