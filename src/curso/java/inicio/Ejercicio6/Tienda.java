package curso.java.inicio.Ejercicio6;

public class Tienda {
	
	private String nombre;
	
	public Tienda(String nombre) {
		this.nombre=nombre;
	}

	public static void main(String[] args) {
		
		Tienda tienda = new Tienda("tienda1");
		Maniqui [] maniquies= tienda.crearManiquiesConRopa();
		System.out.print("El precio total de todo es de: "+tienda.precioTotal(maniquies));
//		System.out.println(maniquies[0].getVestido().getColor());
//		maniquies[0].vestir(new Vestido("Rosa","XXL",130));
//		System.out.println(maniquies[0].getVestido().getColor());
		
	}
	
	private Maniqui [] crearManiquiesConRopa() {
		Maniqui [] maniquies = new Maniqui[2];
		Boton [] botones = new Boton[3];
		for (int i = 0; i < botones.length; i++) {
			botones[i]=new Boton("Verde","Redondo");
		}
		maniquies[0]=new Maniqui(1,new Vestido("Verde","XL",240.6));
		maniquies[1]=new Maniqui(2,
				new Camisa("Azul","XL",100,botones),
				new Pantalon("Amarillo","XL",50,new Boton("Rosa","cuadrado")));
		return maniquies;
	}
	
	private double precioTotal(Maniqui [] maniquies) {
		double total=0;
		for (Maniqui maniqui : maniquies) {
			if(maniqui.getCamisa()!=null) {
				total+=maniqui.getCamisa().getPrecio();
			}
			if(maniqui.getPantalon()!=null){
				total+=maniqui.getPantalon().getPrecio();
			}
			if(maniqui.getVestido()!=null){
				total+=maniqui.getVestido().getPrecio();
			}
		}
		return total;
	}

}
