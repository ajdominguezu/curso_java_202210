package curso.java.inicio.Ejercicio8;

public class BandaMusica {

	private Guitarra guitarra;
	private GuitarraElectrica guitarraElectrica;
	private Bateria bateria;
	private Piano piano;
	public static void main(String[] args) {
		
		BandaMusica bandaMusica = new BandaMusica();
		bandaMusica.iniciarConcierto(bandaMusica.crearInstrumentos());
		
	}
	
	private Instrumento[] crearInstrumentos() {
		guitarra=new Guitarra("Guitarra1","tipo1","Fender",200,5,"Madera");
		guitarraElectrica=new GuitarraElectrica("GuitarraElec1","tipo2","Harley Benton",400,5,"Metal",15);
		bateria=new Bateria("Bateria1","tipo3","Pearl",600,5,3);
		piano=new Piano("Piano1","tipo4","Yamaha",1000,20,3);
		Instrumento[] instrumentos = {guitarra,guitarraElectrica,bateria,piano};
		return instrumentos;
	}
	
	private void iniciarConcierto(Instrumento[] instrumentos) {
		for (Instrumento instrumento : instrumentos) {
			instrumento.afinar();
		}
		for (Instrumento instrumento : instrumentos) {
			if(instrumento instanceof Bateria) {
				Bateria b = (Bateria)instrumento;
				b.aporrear();
			}else {
				instrumento.tocar();	
			}
			
		}
	}
}
