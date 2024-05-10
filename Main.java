public class Main {
	public static void main(String[] arg) {
		
	Vehiculo Sedan= new Vehiculo();
	Sedan.go();

	VehiculoTerrestre Chevrolet = new VehiculoTerrestre();
	Chevrolet.Tierra(); 

	Aviones Airbus = new Aviones();
	Airbus.Alas();

	
	Carro carro = new Carro();
	carro.rellenar();

	Helicopteros apache = new Helicopteros();
	apache.Rotores();


	}
}