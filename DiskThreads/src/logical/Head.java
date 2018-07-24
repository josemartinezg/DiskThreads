package logical;

public class Head extends Thread{
	private Pista pistas;
	private long time;
	
	public Head() {
		
	}
	public Head(Pista operaciones, long time) {
		super();
		this.pistas = operaciones;
		this.time = time;
	}
	
	public Pista getOperaciones() {
		return pistas;
	}
	public void setOperaciones(Pista pistas) {
		this.pistas = pistas;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
}
