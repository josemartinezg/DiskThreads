package logical;

public class Sector extends Thread {
	private int numSector;
	private int numPista;
	private String operacion;
	private Pista discoDuro;

	public Sector(int numSector, int numPista, String operacion) {
		super();
		this.numSector = numSector;
		this.operacion = operacion;
		this.numPista = numPista;
	}


	public int getNumSector() {
		return numSector;
	}


	public void setNumSector(int numSector) {
		this.numSector = numSector;
	}
	public String getOperacion() {
		return operacion;
	}


	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public int getNumPista() {
		return numPista;
	}


	public void setNumPista(int numPista) {
		this.numPista = numPista;
	}


	public Pista getDiscoDuro() {
		return discoDuro;
	}


	public void setDiscoDuro(Pista discoDuro) {
		this.discoDuro = discoDuro;
	}


	@Override
	public void run() {
		System.out.println("El disco comenzará a operar en la pista " + Integer.toString(this.numPista));
		//Recorrer con condiciones para la ejecución.
		System.out.println("El disco en el sector " + Integer.toString(this.numSector) + " está realizando la operación" + this.operacion);
		
	}
}
