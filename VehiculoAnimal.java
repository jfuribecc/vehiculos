public class VehiculoAnimal extends Vehiculo implements Velocidad{

	int NumeroPatas;
	int NumeroAnimal;

	public void Trota() {
		System.out.println("Este vehiculo lo empuja un animal");
	}	
	public void Patas() {
		System.out.println("Este vehiculo lo empujan patas");
	}

	public double speed(){
		return 25;
	}


	public double time(){
		return 5;
	}

}