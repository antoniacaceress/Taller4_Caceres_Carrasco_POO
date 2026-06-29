package taller4;
/**
 * Esta clase modifica los atributos de cada carta dependiendo de su tipo,
 * todo esto con la ayuda de la interfaz VisitorCarta.
 * @author AntoniaCaceres
 */
public class ModificadorAtributos implements VisitorCarta{

	private int daño;
	private int cantEnergias;
	private int bonificacion;
	private int efectosPorTurno;
	private String elemento;
	
	/**
	 * Define y guarda los datos a modificar para una carta Pokemon. 
	 * @param daño
	 * @param cantEnergias
	 */
	public void setPokemon(int daño, int cantEnergias) {
		this.daño = daño;
		this.cantEnergias = cantEnergias;
	}
	
	/**
	 * Define y guarda los datos a modificar para una carta Item. 
	 * @param bonificacion
	 */
	public void setItem(int bonificacion) {
		this.bonificacion = bonificacion;
	}
	
	/**
	 * Define y guarda los datos a modificar para una carta Supporter. 
	 * @param efectos
	 */
	public void setSupporter(int efectos) {
		this.efectosPorTurno = efectos;
	}
	
	/**
	 * Define y guarda los datos a modificar para una carta Energy. 
	 * @param elemento
	 */
	public void setEnergy(String elemento) {
		this.elemento = elemento;
	}
	
	@Override
	public double visitar(Pokemon pokemon) {
		pokemon.setDaño(daño);
		pokemon.setCantEnergias(cantEnergias);
		return 0;
	}

	@Override
	public double visitar(Item item) {
		item.setBonificacion(bonificacion);
		return 0;
	}

	@Override
	public double visitar(Supporter supporter) {
		supporter.setEfectosPorTurno(efectosPorTurno);
		return 0;
	}

	@Override
	public double visitar(Energy energy) {
		energy.setElemento(elemento);
		return 0;
	}

}
