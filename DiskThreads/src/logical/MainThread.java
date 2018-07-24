package logical;

public class MainThread {
	public static void main(String[] args) {
	Pista pista1 = new Pista();
	Pista pista2 = new Pista();
	Pista pista3 = new Pista();
	
	pista1.getMisOperaciones().add(new Operacion(1, 1, "Lectura"));
	pista2.getMisOperaciones().add(new Operacion(2, 5, "Lectura"));
	pista1.getMisOperaciones().add(new Operacion(2, 1, "Lectura"));
	pista1.getMisOperaciones().add(new Operacion(3, 6, "Escritura"));
	pista2.getMisOperaciones().add(new Operacion(3, 1, "Escritura"));
	pista1.getMisOperaciones().add(new Operacion(5, 6, "Lectura"));
	
	long time = System.currentTimeMillis();
	
	Head head1 = new Head();
	head1.setOperaciones(pista1);
	head1.setTime(time);
	
	
	
	}
}
