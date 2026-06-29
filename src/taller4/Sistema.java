package taller4;

public interface Sistema {

	void agregarCarta(Carta carta);
	void eliminarCarta(Carta carta);
	void modificarCarta(Carta carta, ModificadorAtributos m);
	void leerArchivo();
	void odenarRareza();
	void ordenarPoder();
	void ordenarNombre();
	
}
