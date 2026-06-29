package taller4;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Esta clase ordena de manera alfabética todas las cartas
 * que el usuario tenga guardadas en su colección.
 * @author AntoniaCaceres
 */
public class OrdenPorNombre implements StrategyOrden{

	/**
	 * Este método ordena las cartas alfabéticamente por su nombre.
	 * @param coleccion
	 */
	@Override
	public void ordenar(ArrayList<Carta> coleccion) {
		coleccion.sort(new Comparator<Carta>() {
			public int compare(Carta c1, Carta c2) {
				return c1.getNombre().compareTo(c2.getNombre());
			}
		});
		
	}
}
