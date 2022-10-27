package curso.java.inicio.Ejercicio7;



public class Carrera {
	
	//Variables de instancia
	private int distancia;
	private String nombre;
	private Caballo [] caballos;
	private Caballo caballoGanador;
	
	//Constructores
	public Carrera(int distancia, String nombre, Caballo[] caballos) {
		super();
		this.distancia = distancia;
		this.nombre = nombre;
		this.caballos = caballos;
		//this.caballoGanador=caballoGanador;
	}

	//Getters y setters
	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Caballo[] getCaballos() {
		return caballos;
	}

	public void setCaballos(Caballo[] caballos) {
		this.caballos = caballos;
	}
	
	public Caballo getCaballoGanador() {
		return caballoGanador;
	}

	public void setCaballoGanador(Caballo caballoGanador) {
		this.caballoGanador = caballoGanador;
	}

	//Funciones
	public int iniciarCarrera() {
		System.out.println("Empieza la carrera "+this.nombre);
		boolean terminada=false;
		int[] totalmetros= new int[3];
		int posCaballoGanador=0;
		do {
			for (Caballo caballo : this.caballos) {
				caballo.correr();
			}
			terminada=comprobarGanador();
		}while(!terminada);
		
//		while(terminada==false) {
//			for (int i = 0; i < caballos.length; i++) {
//				if(caballos[i].correr()<3000) {
//					totalmetros[i]+=caballos[i].correr();
//				}else{
//					totalmetros[i]+=caballos[i].correr();
//					posCaballoGanador=totalmetros[i];
//					terminada=true;
//				}
//			}
//		}
		
		return caballoGanador.getDorsal();
	}
	
	private boolean comprobarGanador() {
		int mayorDistancia=0;
		for (Caballo caballo : caballos) {
			//Para saber que caballos han llegado al final
			if(caballo.getDistanciaTotalAvanzada()>this.distancia) {
				
				if(caballo.getDistanciaTotalAvanzada()>mayorDistancia) {
					mayorDistancia=caballo.getDistanciaTotalAvanzada();
					this.caballoGanador=caballo;
				}	
			}
		}
		return this.caballoGanador!=null;
	}
	
}
