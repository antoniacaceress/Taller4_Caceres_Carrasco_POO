package taller4;

public class SistemaImpl implements Sistema {

	private static SistemaImpl instancia;
	
	private SistemaImpl() {}
	
	public static SistemaImpl getInstancia() {
		if (instancia == null) {
			instancia = new SistemaImpl();
		}
		return instancia;
	}

	@Override
	public void agregarCarta() {
		
		
	}

	@Override
	public void eliminarCarta() {
		
		
	}

	@Override
	public void modificarCarta() {
		
		
	}
	
}
