public class Helicopteros extends RevisionHoras implements RevisionAceite{

	int NumeroRotores;

	public void Rotores() {
		System.out.println("el vehiculo tiene mínimo dos rotores");
	}



	public void rellenar(){
		System.out.println("Se rellena el vehiculo con aceite");
	}


	public int cajasaceite(){
		return 2;
	}

}