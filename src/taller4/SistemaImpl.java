package taller4;

import java.util.ArrayList;

public class SistemaImpl implements Sistema {

	private static SistemaImpl instancia;
	private ArrayList<Carta> coleccion;
	
	private SistemaImpl() {
		coleccion = new ArrayList<>();
	}
	
	public static SistemaImpl getInstancia() {
		if (instancia == null) {
			instancia = new SistemaImpl();
		}
		return instancia;
	}

	@Override
	public void agregarCarta(Carta carta) {
		coleccion.add(carta);
	}

	@Override
	public void eliminarCarta(Carta carta) {
		coleccion.remove(carta);	
	}

	@Override
	public void modificarCarta(Carta carta) {

	}
	
}
