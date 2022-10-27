package curso.java.inicio;

import java.util.Random;


public class EjemploClaseMathRandom {
    public static void main(String[] args) {
//    	for (int i = 0; i < 5; i++) {
//			tirarDado(6);
//		}

    	Random randomObj = new Random();
    	int random = randomObj.nextInt(10);
    	System.out.println("Numero aleatorio: "+random);
//        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};
//
//        double random = Math.random();
//        System.out.println("random = " + random);
//        random *= colores.length;
//
//        System.out.println("random = " + random);
//        
//        random = Math.floor(random);
//        System.out.println("random = " + random);
//
//        System.out.println("colores = " + colores[(int) random]);
//        
//        Random randomObj = new Random();
//        int randomInt = 15 + randomObj.nextInt(25-15+1);
//        System.out.println("randomInt = " + randomInt);
//
//        randomInt = randomObj.nextInt(colores.length);
//        System.out.println("randomInt = " + randomInt);
//        System.out.println("colores = " + colores[randomInt]);
        
        
    }
    /**
     * Funcion para mostrar por pantalla la tirada de un dado aleatorio. 
     * @param nCaras Las caras del dado a mostrar
     */
    static void tirarDado(int nCaras) {
    	double random = Math.random();
    	int tirada = (int)Math.ceil(nCaras * random);
    	System.out.println(tirada);
    }
}
