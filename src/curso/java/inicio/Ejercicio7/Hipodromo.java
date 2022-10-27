package curso.java.inicio.Ejercicio7;

public class Hipodromo {
	
	private Carrera carrera;
	private Jugador[] jugadores;
	private Caballo[] caballos;
	
	public static void main(String[] args) {
		Hipodromo hipodromo = new Hipodromo();
		hipodromo.crearJugadores();
		hipodromo.crearCaballos();
		hipodromo.abrirHipodromo();
	}
	
	private void crearJugadores() {
		jugadores = new Jugador[2];
		jugadores[0]=new Jugador("Jugador1",1000);
		jugadores[1]=new Jugador("Jugador2",1000);
	}
	
	private void crearCaballos() {
		caballos = new Caballo[3];
		caballos[0]=new Caballo(1,2,6,7,"Caballo1");
		caballos[1]=new Caballo(2,4,8,9,"Caballo2");
		caballos[2]=new Caballo(3,5,9,10,"Caballo3");
	}
	
	private void abrirHipodromo() {
		this.carrera = new Carrera(100,"Gran premio Java",this.caballos);
		realizarApuestas();
		//Iniciamos la carrera
		int dorsalGanador = carrera.iniciarCarrera();
		
		//Comprobar Apuestas
		comprobarApuestas(dorsalGanador);
	}
	
	private void realizarApuestas() {
		//Jugadores realizan apuestas
		for(Jugador jugador:jugadores) {
			System.out.println("El jugador "+jugador.getNombre()+" empieza a apostar");
			jugador.apostar(caballos);
		}
	}
	
	private void comprobarApuestas(int dorsalGanador) {
		for (Jugador jugador:jugadores) {
			if(dorsalGanador==jugador.getApuesta().getDorsal()) {
				double cantidadApostada = jugador.getApuesta().getCantidad();
				double saldo=jugador.getSaldo();
				System.out.println("El jugador "+jugador.getNombre()+" ha acertado la apuesta. Ha ganado "+ (cantidadApostada*5));
				jugador.setSaldo(saldo+=(cantidadApostada*5));
			}
			System.out.println("El jugador "+jugador.getNombre()+" tiene de saldo "+jugador.getSaldo());
			if(jugador.getSaldo()==0) {
				System.out.println("El jugador "+jugador.getNombre()+" se ha arruinado.");
			}
		}
	}
}
