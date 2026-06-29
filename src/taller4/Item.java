package taller4;

public class Item extends Carta{

	private int bonificacion;

	public Item(String nombre, int rareza, String tipo, int bonificacion) {
		super(nombre, rareza, tipo);
		this.bonificacion = bonificacion;
	}

	public int getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(int bonificacion) {
		this.bonificacion = bonificacion;
	}
	
	@Override
	public double aceptar(VisitorCarta visitor) {
		return visitor.visitar(this);
	}

	@Override
	public String toString() {
		return getNombre() + ";"  + getRareza() + ";" + getTipo() + ";" + bonificacion;
	}

}
