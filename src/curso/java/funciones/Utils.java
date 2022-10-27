package curso.java.funciones;

import java.util.Scanner;

public class Utils {
	
	/**
	 * Funcion para pedir que se introduzca un valor y despues lo devuelve en el return
	 * @param texto Es el texto para pedir el valor
	 * @return String con el valor pedido
	 */
	public static String pideValor(String texto) {
		String reply="";
		System.out.print(texto);
		Scanner sc = new Scanner(System.in);
		reply = sc.nextLine();
		//sc.close();
		return reply;
	}
	
	/**
	 * Funcion que pide valor con el texto por defecto "Introduce una opcion" 
	 * @return String con el valor introducido
	 */
	public static String pideValor() {
		return pideValor("Introduce una opcion: ");
	}
	
	/**
	 * Funcion para pintar el menu que se le pasa en el parametro
	 * @param menu (menu a pintar)
	 */
	public static void pintarMenu(String menu) {
		System.out.println(menu);
	}
	
	/**
	 * Funcion para pintar el menu por defecto
	 */
	public static void pintarMenu() {
		System.out.println("Menu:\n"
				+ "1. Pintar cuadrado\n"
				+ "2. Validar email\n"
				+ "3. Serie Fibonacci\n"
				+ "4. Insertar Nombres\n"
				+ "5. Salir\n");
	}
	
	/**
	 * Funcion para devolver un numero aleatorio entre 1 y el pasado
	 * @param num el numero a pasar desde el uno hasta el
	 * @return devuelve el numero aleatorio.
	 */
    public static int tiradaAleatoria(int num) {
    	double random = Math.random();
    	int tirada = (int)Math.ceil(num * random);
    	return tirada;
    }
}
