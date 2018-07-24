package logical;

import java.util.ArrayList;

public class Pista extends Thread {
	private ArrayList<Sector> misOperaciones;

	public Pista() {
		super();
		misOperaciones = new ArrayList<>();
	}
	public ArrayList<Sector> getMisOperaciones() {
		return misOperaciones;
	}

	public void setMisOperaciones(ArrayList<Sector> misOperaciones) {
		this.misOperaciones = misOperaciones;
	}
}
