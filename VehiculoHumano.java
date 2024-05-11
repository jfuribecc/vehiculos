public class VehiculoHumano extends Vehiculo implements Velocidad{

	int NumeroPiernas;
	int NumeroPersonas;

	void Camina() {
		System.out.println("Este vehiculo lo empuja una persona");
	}	

	void Piernas() {
		System.out.println("Este vehiculo lo empujan Piernas");
	}

	public double speed(){
		return 25;
	}


	public double time(){
		return 5;
	}
}