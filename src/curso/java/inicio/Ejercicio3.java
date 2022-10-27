package curso.java.inicio;

import java.util.Arrays;
import java.util.Random;

import curso.java.funciones.Utils;

public class Ejercicio3 {
	
	private static final int CARASDADO=6;
	private static final int CANTDADOS=2;

	public static void main(String[] args) {
		
		System.out.println("Un dado");
		System.out.println("===================================");
		unDado();
		System.out.println("\nDos dados");
		System.out.println("===================================");
		dosDados();
		
	}
	
	static void unDado() {
		int nVeces=Integer.parseInt(Utils.pideValor("Introduzca el numero de veces que se va a lanzar el dado: "));
		int [] guardarValores = new int[nVeces];
		for (int i = 0; i < nVeces; i++) {
	    	guardarValores[i]=Utils.tiradaAleatoria(CARASDADO);
		}
		System.out.println(Arrays.toString(guardarValores));
		Arrays.sort(guardarValores);
		System.out.println("\nEl numero mas alto es: "+guardarValores[guardarValores.length-1]);
		System.out.println("El numero mas bajo es: "+guardarValores[0]);
		System.out.println("La media es: "+media(guardarValores, nVeces));
	}
	static float media(int [] guardarValores, int nVeces) {
		int media=0;
		for (int i = 0; i < guardarValores.length; i++) {
			media+=guardarValores[i];
		}
		return media/nVeces;
	}
	static void dosDados() {
		int nVeces=5;
		int [][] guardarValores= new int [nVeces][CANTDADOS];
		int [] suma = new int[nVeces];
		for (int i = 0; i < nVeces; i++) {
			for (int j = 0; j < CANTDADOS; j++) {
		    	guardarValores[i][j]=Utils.tiradaAleatoria(CARASDADO);
			}
			suma[i]=guardarValores[i][0]+guardarValores[i][1];
		}
		System.out.println(Arrays.toString(suma));
		Arrays.sort(suma);
		System.out.println("La suma de los numeros mas alta es: "+suma[suma.length-1]);
		
	}
}
