package taller4;

public class Energy extends Carta{

	private String elemento;

	public Energy(String nombre, int rareza, String tipo, String elemento) {
		super(nombre, rareza, tipo);
		this.elemento = elemento;
	}

	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	@Override
	public double aceptar(VisitorCarta visitor) {
		return visitor.visitar(this);
	}

	@Override
	public String toString() {
		return getNombre() + ";"  + getRareza() + ";" + getTipo() + ";" + elemento;
	}
	
	
	
}
