package curso.java.inicio;

import curso.java.poo.Cliente;

public class Supermercado {

	public static void main(String[] args) {
		
		Cliente [] clientesArr = new Cliente[4];
		clientesArr[0] = new Cliente("Pepe", "rodriguez", "26048491W");
		clientesArr[1] = new Cliente("Juan", "Dominguez", "67307185P");
		clientesArr[2] = new Cliente("Rosa", "Marin", "16268634K");
		clientesArr[3] = new Cliente("Maria", "Duran", "75318076E");
		
		clientesArr[0].comprar(200);
		clientesArr[1].comprar(100);
		clientesArr[2].comprar(330.3);
		clientesArr[3].comprar(20);
		
		for (Cliente cliente : clientesArr) {
			System.out.println(cliente.getNombre());
		}
		//Para poder llamar a una funcion que no sea estatica necesitamos crear un objeto de nuestra clase supermercado.
		Supermercado super1=new Supermercado();
		super1.importeTotal(clientesArr);
		
	}

	private void importeTotal(Cliente [] clientesArr) {
		double total=0;
		for (Cliente cliente : clientesArr) {
			total+=cliente.getImporteCompra();	
		}
		System.out.println("El importe total de la compra es de: "+total);
	}
	
}
