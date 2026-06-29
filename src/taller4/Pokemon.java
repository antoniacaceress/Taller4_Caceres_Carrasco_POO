package taller4;

public class Pokemon extends Carta{

	private int daño;
	private int cantEnergias;

	public Pokemon(String nombre, int rareza, String tipo, int daño, int cantEnergias) {
		super(nombre, rareza, tipo);
		this.daño = daño;
		this.cantEnergias = cantEnergias;
	}

	public int getDaño() {
		return daño;
	}

	public void setDaño(int daño) {
		this.daño = daño;
	}


	public int getCantEnergias() {
		return cantEnergias;
	}


	public void setCantEnergias(int cantEnergias) {
		this.cantEnergias = cantEnergias;
	}
	
	@Override
	public double aceptar(VisitorCarta visitor) {
		return visitor.visitar(this);
	}

	@Override
	public String toString() {
		return getNombre() + ";"  + getRareza() + ";" + getTipo() + ";" + daño + ";" + cantEnergias;
	}	
}
