package taller4;

import java.util.ArrayList;
import java.util.Comparator;

public class OrdenPorRareza implements StrategyOrden {

	@Override
	public void ordenar(ArrayList<Carta> coleccion) {
		coleccion.sort(new Comparator<Carta>() {
			public int compare(Carta carta1, Carta carta2) {
				return Integer.compare(carta1.getRareza(), carta2.getRareza());
			}
		});
		
	}

}
