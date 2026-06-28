package taller4;

import java.util.ArrayList;
import java.util.Comparator;

public class OrdenPorPoder implements StrategyOrden{

	@Override
	public void ordenar(ArrayList<Carta> coleccion) {
		
		for (Carta c : coleccion) {
			VisitorCarta v = new CalcularPoder();
			c.aceptar(v);
		}
		
		coleccion.sort(new Comparator<Carta>() {
			public int compare(Carta carta1, Carta carta2) {
				return Double.compare(carta1.getPoder(), carta2.getPoder());
			}
		});
		
	}

}
