package curso.java.inicio;

import java.util.ArrayList;


public class ListasJava {

	public static void main(String[] args) {
		
		ArrayList<String> lista1 = new ArrayList<String>();
		
		lista1.add("hola");
//		lista1.add(1);
//		lista1.add(new Boton("Verde", "Redonda"));
		lista1.add("que");
		lista1.add("tal");
		lista1.add(1,"Hoy es viernes por fin");
		for (String texto : lista1) {
			System.out.println(texto);
		}
		System.out.println(lista1.size());
		System.out.println(lista1.isEmpty());
		System.out.println(lista1.contains("hola"));
		System.out.println(lista1.contains("adios"));
		System.out.println(lista1.get(3));

	}

}
