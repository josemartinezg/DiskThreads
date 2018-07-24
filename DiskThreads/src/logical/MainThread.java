package logical;

public class MainThread {
	public static void main(String[] args) {
	Pista pista1 = new Pista();
	Pista pista2 = new Pista();
	Pista pista3 = new Pista();
	
	pista1.getMisOperaciones().add(new Sector(1, 1, "Lectura"));
	pista2.getMisOperaciones().add(new Sector(2, 5, "Lectura"));
	pista1.getMisOperaciones().add(new Sector(2, 1, "Lectura"));
	pista1.getMisOperaciones().add(new Sector(3, 6, "Escritura"));
	pista2.getMisOperaciones().add(new Sector(3, 1, "Escritura"));
	pista1.getMisOperaciones().add(new Sector(5, 6, "Lectura"));
	
	}
}
