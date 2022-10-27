package curso.java.inicio.EjercicioExcepciones;

public class Cliente {

	private String nombre;

	//Constructor
	public Cliente(String nombre) {
		super();
		this.nombre = nombre;
	}

	//Getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Funciones
	public void tomarCafe(CoffeCup taza) throws TooHotException,TooColdException{
		if(taza.getTemperatura()>80) {
			throw new TooHotException("Cafe muy caliente "+taza.getTemperatura()+" ºC");
		}else if (taza.getTemperatura()<20) {
			throw new TooColdException("Cafe muy frio "+taza.getTemperatura()+" ºC");
		}else {
			System.out.println("El cliente se toma el cafe tranquilamente "+taza.getTemperatura()+" ºC");
		}
	}
	
	
}
