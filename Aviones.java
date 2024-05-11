public class Aviones extends VehiculoAereo{

	int numeroAlas;
	Computador computadora;
	Televisor tele;


	Aviones(){
		computadora = new Computador(2,8,4,5);
		tele = new Televisor(6,6,5,6);
		
	}

	public void alas() {
		System.out.println("el vehiculo tiene mínimo dos Alas");
		
	}

	public void xd(){
		computadora.prender();
		tele.encender();
	
	}



}
