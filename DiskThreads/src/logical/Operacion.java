package logical;

public class Operacion extends Thread {
	private int numSector;
	private int numPista;
	private String nombreOperacion;
	private Pista discoDuro;
	
	public Operacion(int numSector, int numPista, String operacion) {
		super();
		this.numSector = numSector;
		this.nombreOperacion = nombreOperacion;
		this.numPista = numPista;
	}


	public int getNumSector() {
		return numSector;
	}


	public void setNumSector(int numSector) {
		this.numSector = numSector;
	}
	public String getNombreOperacion() {
		return nombreOperacion;
	}


	public void setNombreOperacion(String operacion) {
		this.nombreOperacion = operacion;
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
		System.out.println("El disco en el sector " + Integer.toString(this.numSector) + " está realizando la operación" + this.nombreOperacion);
		
	}
}
