package taller4;

public abstract class Carta {

	private String nombre;
	private int rareza;
	private String tipo;
	private String imagen;
	private StrategyOrden estrategia;
	private int poder;

	public Carta(String nombre, int rareza, String tipo) {
		super();
		this.nombre = nombre;
		this.rareza = rareza;
		this.tipo = tipo;
		this.imagen = imagen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getRareza() {
		return rareza;
	}

	public void setRareza(int rareza) {
		this.rareza = rareza;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
   public StrategyOrden getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(StrategyOrden estrategia) {
		this.estrategia = estrategia;
	}
	
   public int getPoder() {
		return poder;
	}

	public void setPoder(int poder) {
		this.poder = poder;
	}
	
   @Override
	public String toString() {
		return nombre + "| rareza: " + rareza + "| tipo: " + tipo + "| estrategia: " + estrategia + "| poder: " + poder;
	}

   public abstract double aceptar(VisitorCarta visitor);
	
	
	
}
