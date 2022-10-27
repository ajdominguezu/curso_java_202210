package curso.java.inicio.Ejercicio6;

/**
 * Clase que representa una objeto de tipo Maniqui
 * @author anton
 *
 */
public class Maniqui {

	//Variables de instancia
	private long id;
	private Camisa camisa;
	private Pantalon pantalon;
	private Vestido vestido;
	
	//Constructores
	public Maniqui(long id) {
		super();
		this.id = id;
	}

	public Maniqui(long id, Camisa camisa, Pantalon pantalon) {
		super();
		this.id = id;
		this.camisa = camisa;
		this.pantalon = pantalon;
	}

	public Maniqui(long id, Vestido vestido) {
		super();
		this.id = id;
		this.vestido = vestido;
	}

	//Getters y setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Camisa getCamisa() {
		return camisa;
	}

	public Pantalon getPantalon() {
		return pantalon;
	}

	public Vestido getVestido() {
		return vestido;
	}
	
	//Funciones
	public void vestir(Camisa camisa, Pantalon pantalon) {
		this.camisa=camisa;
		this.pantalon=pantalon;
	}
	public void vestir(Vestido vestido) {
		this.vestido=vestido;
	}
	
	public void desvestir() {
		camisa=null;
		pantalon=null;
		vestido=null;
	}
	
}
