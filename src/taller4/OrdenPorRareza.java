package taller4;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Esta clase ordena de mayor a menor las cartas
 * dependiendo de su nivel de rareza.
 * @author AntoniaCaceres
 */
public class OrdenPorRareza implements StrategyOrden {

	/**
	 * Este método ordena de mayor a menor la colección de cartas
	 * dependiendo del nivel de rareza que cada una posea.
	 * @param coleccion
	 */
	@Override
	public void ordenar(ArrayList<Carta> coleccion) {
		coleccion.sort(new Comparator<Carta>() {
			public int compare(Carta carta1, Carta carta2) {
				return Integer.compare(carta2.getRareza(), carta1.getRareza());
			}
		});
		
	}

}
