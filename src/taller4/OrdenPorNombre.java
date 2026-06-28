package taller4;

import java.util.ArrayList;
import java.util.Comparator;

public class OrdenPorNombre implements StrategyOrden{

	@Override
	public void ordenar(ArrayList<Carta> coleccion) {
		coleccion.sort(new Comparator<Carta>() {
			public int compare(Carta c1, Carta c2) {
				return c1.getNombre().compareTo(c2.getNombre());
			}
		});
		
	}

}
