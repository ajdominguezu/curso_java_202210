package curso.java.inicio.Ejercicio7;

import curso.java.funciones.Utils;

public class Jugador {

	//Variables de instancia
	private String nombre;
	private double saldo;
	private Apuesta apuesta;
	
	//Constructor
	public Jugador(String nombre, double saldo) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
	}

	//Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Apuesta getApuesta() {
		return apuesta;
	}

	public void setApuesta(Apuesta apuesta) {
		this.apuesta = apuesta;
	}
	
	//Funciones
	public void apostar(Caballo[] caballos) {
		double cantidad=0;
		int dorsal=0;
		boolean apuestaCorrecta=false;
		//Controlar que la cantidad apostada sea correcta
		do {
			cantidad=Double.parseDouble(Utils.pideValor("¿Cuanto quieres apostar?: "));
			apuestaCorrecta=compruebaApuesta(cantidad);
		}while(!apuestaCorrecta);
		
		String texto="¿A que caballo?: ";
		for (Caballo caballo : caballos) {
			texto+=caballo.getDorsal()+", ";
		}
		apuestaCorrecta=false;
		//do {
			dorsal=Integer.parseInt(Utils.pideValor(texto));
			//apuestaCorrecta=compruebaApuestaDorsal(dorsal, caballos);
		//}while(!apuestaCorrecta);
//		caballo=Integer.parseInt(Utils.pideValor());
			Apuesta apuesta = new Apuesta(cantidad,dorsal);
			this.setApuesta(apuesta);
			//Actualizar saldo quitandole la cantidad apostada
			this.saldo-=cantidad;
		
	}
	
	private boolean compruebaApuesta(double cantidad) {
		return cantidad<=this.saldo && cantidad>0;
	}
	
//	private boolean compruebaApuestaDorsal(int dorsal, Caballo[] caballos) {
//		boolean apuestaDorsal=false;
//		for (Caballo caballo : caballos) {
//			
//		}
//	}
}
