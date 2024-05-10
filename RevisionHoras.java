public abstract class RevisionHoras {

	private int horasvuelo;
	private String pasar;

	
	RevisionHoras(){
	}
	
	
	RevisionHoras(int horasvuelo, String pasar){
		this.horasvuelo = horasvuelo;
		this.pasar = pasar;
	}

	public int horasvuelo(){
		return horasvuelo;
	}

	public String pasar(){
		return pasar;
	}
}