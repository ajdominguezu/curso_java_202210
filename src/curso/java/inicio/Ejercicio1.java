//1. Creais una clase Ejercicio1 

//Menu:
//1. Pintar cuadrado
//2. Validar email
//3. Serie Fibonacci
//4. Insertar Nombres
//5. Salir
//Selecciona una opcion:

//Mientras que la opcion sea diferente que 5 tiene que seguir mostrando el menú.

//Opcion 1. Pintar cuadrado || Introduce el tamaño del cuadrado: 
//Opcion 2. Validar email || No puede contener espacion en blanco, solo tiene que haber un @, despues del arroba tiene que haber al menos 1 punto
//despues del ultimo punto tiene que haber entre 2 y 6 caracteres,
//Opcion 3. Serie Fibonacci || 
//Opcion 4. Insertar Nombres || 
//Opcion 5. Salir || 
package curso.java.inicio;


import curso.java.funciones.Utils;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		
		int menu;
		menu=0;//inicializamos la variable
		do {
			Utils.pintarMenu();
			menu = Integer.parseInt(Utils.pideValor());
			switch (menu) {//switch del menu
			case 1:
				pintarCuadrado();
				break;
			case 2:
				validarEmail(); 
				break;
			case 3:
				//fibonacciNormal();
				
				int numElementos = Integer.parseInt(Utils.pideValor("Introduce el numero de elementos de la serie de fibonacci: "));
				for(int i=0;i<numElementos;i++) {
					int numero=fibonacciRecursiva(i);
					System.out.print(numero+",");
				}
				System.out.println("");
				
				break;
			case 4:
				pintarAlumnos();
				break;
			case 5:
				System.out.println("Finalizacion del progama, Adios.");
				break;

			default:
				System.out.println("Opcion incorrecta introduzcala de nuevo.");
				break;
			}
		} while (menu!=5);
		
//		sc.close();
	}
	
	/**
	 * Funcion para pintar un cuadrado usando bucles
	 */
	static void pintarCuadrado () {
		int tam_cu = Integer.parseInt(Utils.pideValor("Introduce el tamaño del cuadrado: "));
		for(int fil=0;fil<tam_cu;fil++) {
			for(int col=0;col<tam_cu;col++) {
				if(fil==0 || fil==tam_cu-1 || col==0 || col==tam_cu-1)
					System.out.print("*");
				else 
					System.out.print(" ");
				
			}	
			System.out.println("");
		}
//		sc.close();
	}
	
	/**
	 * Funcion para validar un email
	 * @param email
	 * @return
	 */
	static void validarEmail() {
		String email = Utils.pideValor("Introduce el email: ");
		email=email.trim();//eliminar espacios en blanco a izquierda y derecha
		String mensajeError = "";
		
		//CASO 1, tiene espacios en blanco 
		if(email.contains(" ")) {
			mensajeError+="El email no puede contener espacios en blanco";
		}
		
		//CASO 2, solo tiene que tener 1 @
		if (email.indexOf("@")==-1 || email.indexOf("@")!=email.lastIndexOf("@")){
		mensajeError+="Tiene que haber una arroba";
		}
//		int cantArrobas=0;
//		for (int i = 0; i <email.length (); i++) {
//			if(email.charAt(i)=='@') {
//				cantArrobas++;
//			}
//		}
//		if(cantArrobas!=1) {
//			mensajeError = "El email solo tiene que tener un @";
//		}
		
		
		//CASO 3, Después de la @ tiene que haber al menos un punto
		
		if(!email.substring(email.indexOf("@")).contains(".")) {
			mensajeError+="El email solo tiene que tener un punto";
		}else{
			int tam_dominio_tld = email.substring(email.lastIndexOf(".")+1).length();
			if(tam_dominio_tld<2 || tam_dominio_tld>6) {
				mensajeError+="El tamaño tiene que estar entre 2 y 6";
			}
		};
		
//		int posArr = 0;
//		for (int i = 0; i <email.length (); i++) {
//			if(email.charAt(i)=='@') {
//				posArr=i;
//			}
//		}
//		String domain=email.substring(posArr);
//		int cantPtos=0;
//		for (int i = 0; i <domain.length(); i++) {
//			if(domain.charAt(i)=='.') {
//				cantPtos++;
//			}
//		}
//		System.out.println(domain);
//		if(cantPtos!=1) {
//			mensajeError = "El email solo tiene que tener un punto";
//		}
		
		//CASO 4, Después del último punto tiene que haber entre 2 y 6 caracteres
		
		
		//mostrar por pantalla si error o no error
		if (mensajeError.equals("")) {
			System.out.println("El email "+email+" es correcto");
		}else {
			System.out.println("El email "+email+" es incorrecto, "+mensajeError);
		}
		
	}

	/**
	 * Funcion para pintar la serie de fibonacci
	 */
	static void fibonacciNormal() {
		
		int numElementos=Integer.parseInt(Utils.pideValor("Introduce el numero de elementos de la serie de fibonacci"));
		int num1=0, num2=1, suma=num1+num2;
		
		System.out.print(num1+",");
		System.out.print(num2+",");
		for (int i=0;i<numElementos-2;i++) {
			System.out.print(suma+",");
			num1=num2;
			num2=suma;
			suma=num2+num1;
		}
		System.out.println("");
	}
	
	/**
	 * Funcion para hacer la funcion de fibonacci recursiva
	 * @param numero
	 * @return
	 */
	static int fibonacciRecursiva(int numero) {
		if(numero==0 || numero==1) {
			return numero;
		}else {
			return fibonacciRecursiva(numero-1)+fibonacciRecursiva(numero-2);
		}
		
		
	}
	
	/**
	 * Funcion para pedir el numero de los alumnos, despues pide uno por uno el nombre y los muestra por pantalla.
	 */
	static void pintarAlumnos() {
		int numAlumnos=Integer.parseInt(Utils.pideValor("Introduce el numero de alumnos: "));
		
		String [] alumnos = new String[numAlumnos];
		
		for (int i = 0; i < alumnos.length; i++) {
			alumnos[i] = Utils.pideValor("Introduce el nombre del alumno "+(i+1)+": ");
		}
		for (String nombreAlumno : alumnos) {
			System.out.println(nombreAlumno);
		}
	}

}
