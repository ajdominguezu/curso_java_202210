package curso.java.inicio.EjercicioExcepciones;

import curso.java.funciones.Utils;

public class Bar {

	public static void main(String[] args) {
		CoffeCup taza = new CoffeCup(Utils.tiradaAleatoria(100));
		Cliente cliente = new Cliente("Cliente1");
		
		try {
			cliente.tomarCafe(taza);
		} catch (TooHotException e) {
			System.out.println("El cliente se ha quemado, "+e.getMessage());
			//e.printStackTrace();
		} catch (TooColdException e) {
			System.out.println("El cliente se ha dejado el cafe, "+e.getMessage());
			//e.printStackTrace();
		}
	}
}
