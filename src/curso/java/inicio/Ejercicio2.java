package curso.java.inicio;

import curso.java.funciones.Utils;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int n_aulas=Integer.parseInt(Utils.pideValor("¿Cuantas aulas tiene el colegio?: "));
		int n_alumnos=Integer.parseInt(Utils.pideValor("¿Cuantos alumnos caben en cada aula?: "));
		String [][] colegio = new String[n_aulas][n_alumnos];
		
		int menu=0;
		do {
			Utils.pintarMenu("Menu:\n"
					+ "1. Insertar Alumno por Aula\n"
					+ "2. Buscar Alumno\n"
					+ "3. Borrar Alumno\n"
					+ "4. Mostrar Alumnos por Aula\n"
					+ "5. Mostrar Alumnos\n"
					+ "6. Salir");
			menu = Integer.parseInt(Utils.pideValor());
			
			switch (menu) {//switch del menu
			case 1:
				int p1_aula=Integer.parseInt(Utils.pideValor("En que aula vas a introducir al alumno?: "));
				colegio=insertarAlumno(p1_aula, n_alumnos, colegio);
				
				break;
			case 2:
				buscarAlumno(n_aulas, n_alumnos, colegio);
				break;
			case 3:
				colegio=borrarAlumno(n_aulas, n_alumnos, colegio);
				break;
			case 4:
				int p2_aula=Integer.parseInt(Utils.pideValor("Que aula vas a mostrar?: "));
				mostrarAula(p2_aula, n_alumnos, colegio);
				System.out.println("");
				break;
			case 5:
				mostrarTodos(n_aulas, n_alumnos, colegio);
				System.out.println("");
				break;
			case 6:
				System.out.println("Finalizacion del progama, Adios.");
				break;

			default:
				System.out.println("Opcion incorrecta introduzcala de nuevo.");
				break;
			}
		}while(menu!=6);
	}
	
	/**
	 * Funcion para insertar un alumno en una aula concreta
	 * @param pos_aula el aula donde vamos a insertar el alumno
	 * @param n_alumnos la cantidad de alumnos disponibles por cada aula
	 * @param colegio el array doble del colegio para poder trabajar con el
	 * @return
	 */
	//****CORRECCION****: No hace falta que el metodo sea String [][] porque al ser objeto mutable (Array) y pasarse por referencia si 
	//se modifican dentro del metodo, asi que solo pondriamos "public static void insertarAlumno(...){...}", si fuese solo el String al
	//ser inmutable no se modificaría, y si haria falta poner el String[][].
	public static String [][] insertarAlumno(int pos_aula, int n_alumnos, String [][] colegio) {
		int contlleno=0;
		for (int i = 0; i < n_alumnos; i++) {//comprobar con un for que el contenido de los arrays no sea nulo
			if(colegio[pos_aula][i]!=null) {
				contlleno++;
			}
		}
		
		if (contlleno==n_alumnos) {//si el contador de no nulos es igual a la cantidad de alumnos eso significa que esta lleno el array
			System.out.println("Error, el aula esta llena");
		}else {//sino eso significa que esta vacio
			String nom_alumno=Utils.pideValor("Introduzca el nombre del alumnno: ");
			colegio[pos_aula][contlleno]=nom_alumno;//asignamos al ultimo que se ha quedado el contador
			
		}
		return colegio;
	}

	/**
	 * Funcion para buscar un alumno y que te diga en que aula esta
	 * @param n_aulas la cantidad de aulas que hay
	 * @param n_alumnos la cantidad de alumnos que caben en cada aula
	 * @param colegio el colegio donde se va a buscar
	 */
	public static void buscarAlumno(int n_aulas, int n_alumnos, String[][] colegio) {
		int aula=0;
		boolean enc=false,salir=false;
		String nombre = Utils.pideValor("Introduce el nombre a buscar: ");
		while (enc==false && salir==false) {
		for (int i = 0; i < n_aulas; i++) {
			for (int j = 0; j < n_alumnos; j++) {
				if (colegio[i][j]!=null && colegio[i][j].equals(nombre)) {
					aula=i;
					enc=true;
				}
			}
		}
		salir=true;
		}
		
		if(enc==true) {
			System.out.println("Se ha encontrado al alumno "+nombre+" en el aula "+aula);
		}else {
			System.out.println("No se ha encontrado al alumno");
		}
	}
	
	/**
	 * Funcion para buscar un alumno y que te lo borre
	 * @param n_aulas la cantidad de aulas que hay
	 * @param n_alumnos la cantidad de alumnos que caben en cada aula
	 * @param colegio el colegio donde se va a buscar
	 */
	public static String[][] borrarAlumno(int n_aulas, int n_alumnos, String[][] colegio) {
		int aula=0, alum=0;
		boolean enc=false,salir=false;;
		String nombre = Utils.pideValor("Introduce el nombre a buscar: ");
		while (enc==false && salir==false) {
		for (int i = 0; i < n_aulas; i++) {
			for (int j = 0; j < n_alumnos; j++) {
				if (colegio[i][j]!=null && colegio[i][j].equals(nombre)) {
					aula=i;
					alum=j;
					enc=true;
				}
			}
		}
		salir=true;
		}
		
		if(enc==true) {
			colegio[aula][alum]=null;
			System.out.println("Se ha borrado al alumno "+nombre+" correctamente");
			return colegio;
		}else {
			System.out.println("No se ha encontrado al alumno");
			return colegio;
		}
	}
	
	/**
	 * Funcion para mostrar los alumnos de un solo aula
	 * @param pos_aula la cantidad de aulas que hay
	 * @param n_alumnos la cantidad de alumnos que caben en cada aula
	 * @param colegio el colegio donde se va a buscar
	 */
	public static void mostrarAula(int pos_aula, int n_alumnos, String[][] colegio) {
		System.out.print("Alumnos del aula "+pos_aula+": ");
		for (int i = 0; i < n_alumnos; i++) {
			if(colegio[pos_aula][i]!=null) {
				System.out.print(colegio[pos_aula][i]+", ");
			}
		}
	}
	
	/**
	 * Funcion para mostrar todos los alumnos del colegio
	 * @param n_aulas la cantidad de aulas que hay
	 * @param n_alumnos la cantidad de alumnos que caben en cada aula
	 * @param colegio el colegio donde se va a buscar
	 */
	public static void mostrarTodos(int n_aulas, int n_alumnos, String[][] colegio) {
		for (int i = 0; i < n_aulas; i++) {
			System.out.print("Alumnos del Aula "+i+": ");
			for (int j = 0; j < n_alumnos; j++) {
				if(colegio[i][j]!=null) {
					System.out.print(colegio[i][j]+", ");
				}
			}
			System.out.println("");
			}
		}
}
