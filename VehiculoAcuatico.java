public abstract class VehiculoAcuatico {

	private int numeropropelas;
	private int numerovelas;
	private String nombreBarco;

	VehiculoAcuatico(){
	}

	public void setVehiculoAcuatico( int propelas,int velas, String nombre){
		this.numeropropelas = propelas;
		this.numerovelas = velas;

	
	}

	public int getNumeropropelas(){
		return numeropropelas;
	}


	public int getNumerovelas(){
		return numerovelas;
	}



	public void Acuatico() {
		System.out.println("el vehiculo se mueve por Agua");
	}


}