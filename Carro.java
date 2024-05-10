public class Carro extends VehiculoTerrestre implements RevisionAceite{

	int NumeroSillas;
	Llanta llanta1;
	Llanta llanta2;
	public void Sillas() {
		System.out.println("el vehiculo tiene por lo menos dos sillas ");
	}
	
	public void rellenar(){
		System.out.println("Se rellena el vehiculo con aceite");
	}

	public int cajasaceite(){
		return 2;
	}

	public void andar(){
		llanta1.andar();
	}
}
