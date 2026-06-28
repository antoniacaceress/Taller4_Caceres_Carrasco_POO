package taller4;

public class CalcularPoder implements VisitorCarta {

	@Override
	public double visitar(Pokemon pokemon) {
		return (pokemon.getDaño() / pokemon.getCantEnergias()) * 100;
	}

	@Override
	public double visitar(Item item) {
		return item.getBonificacion() * 20;
	}

	@Override
	public double visitar(Supporter supporter) {
		return supporter.getEfectosPorTurno() * 50;
	}

	@Override
	public double visitar(Energy energy) {
		return 1;
	}

	
	
}
