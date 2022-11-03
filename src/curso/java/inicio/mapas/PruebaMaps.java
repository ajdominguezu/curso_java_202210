package curso.java.inicio.mapas;

import java.util.HashMap;
import java.util.Map;

import curso.java.inicio.ejercicioColecciones.Estudiante;

public class PruebaMaps {

	public static void main(String[] args) {
		Map<String, Estudiante> mapa1 = new HashMap<String, Estudiante>();
		
		Estudiante estudiante1 = new Estudiante("Nombre1", "Ape1", "11111111A");
		Estudiante estudiante2 = new Estudiante("Nombre2", "Ape2", "22222222B");
		mapa1.put(estudiante1.getDNI(), estudiante1);
		mapa1.put(estudiante2.getDNI(), estudiante2);
		
		Estudiante estudiante = mapa1.get("11111111A");
		//System.out.println(estudiante.getNombre());
		
		if (mapa1.containsKey("11111111A")) {
			
		}
		
		for (String clave : mapa1.keySet()) {
			System.out.println(clave);
		}
		
		

	}

}
