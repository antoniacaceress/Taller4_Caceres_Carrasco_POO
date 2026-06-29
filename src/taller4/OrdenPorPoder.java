package taller4;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Esta clase ordena de mayor a menor las cartas dependiendo
 * del poder que cada una posea.
 * @author AntoniaCaceres
 */
public class OrdenPorPoder implements StrategyOrden{

	/**
	 * Ordena la colección de cartas de mayor a menor por poder.
	 * @param coleccion
	 */
	@Override
	public void ordenar(ArrayList<Carta> coleccion) {
		
		for (Carta c : coleccion) {
			VisitorCarta v = new CalcularPoder();
			c.aceptar(v);
		}
		
		coleccion.sort(new Comparator<Carta>() {
			public int compare(Carta carta1, Carta carta2) {
				return Double.compare(carta2.getPoder(), carta1.getPoder());
			}
		});
		
	}
}
