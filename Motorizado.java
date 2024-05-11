public abstract class Motorizado extends Vehiculo implements Velocidad {

	public int engine;
	public char marca;
	public String nombre;

	
	public void prendido() {
		System.out.println("el motor se encuentra prendido");
	}
	public void apagado() {
		System.out.println("el motor se encuentra Apagado");
	}	

	public double speed(){
		return 25;
	}


	public double time(){
		return 5;
	}

}