package logical;

import java.util.ArrayList;

public class Pista extends Thread {
	private ArrayList<Operacion> misOperaciones;

	public Pista() {
		super();
		misOperaciones = new ArrayList<>();
	}
	public ArrayList<Operacion> getMisOperaciones() {
		return misOperaciones;
	}

	public void setMisOperaciones(ArrayList<Operacion> misOperaciones) {
		this.misOperaciones = misOperaciones;
	}
}
