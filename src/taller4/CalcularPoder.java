package taller4;
/**
 * Esta clase calcula el poder que tiene cada carta dependiendo del tipo.
 * Cada vez que se desee calcular el poder de una carta se debe llamar a esta clase.
 * @author AntoniaCaceres
 */
public class CalcularPoder implements VisitorCarta {

	@Override
	public double visitar(Pokemon pokemon) {
		double nuevoPoder = (pokemon.getDaño() / pokemon.getCantEnergias()) * 100;
		pokemon.setPoder(nuevoPoder);
		return nuevoPoder;
	}

	@Override
	public double visitar(Item item) {
		double nuevoPoder =  item.getBonificacion() * 20;
		item.setPoder(nuevoPoder);
		return nuevoPoder;
	}

	@Override
	public double visitar(Supporter supporter) {
		double nuevoPoder = supporter.getEfectosPorTurno() * 50;
		return nuevoPoder;
	}

	@Override
	public double visitar(Energy energy) {
		energy.setPoder(1);
		return 1;
	}

	
	
}
