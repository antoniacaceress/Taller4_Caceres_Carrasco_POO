package taller4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SistemaImpl implements Sistema {

	private static SistemaImpl instancia;
	private static ArrayList<Carta> coleccion = new ArrayList<>();
	
	
	private SistemaImpl() {
		coleccion = new ArrayList<>();
	}
	
	public static SistemaImpl getInstancia() {
		if (instancia == null) {
			instancia = new SistemaImpl();
		}
		return instancia;
	}
	
	public ArrayList<Carta> getColeccion() {
	    return coleccion;
	}

	@Override
	public void agregarCarta(Carta carta) {
		coleccion.add(carta);
		TrabajoArchivos.modificadorArchivos(coleccion);
	}

	@Override
	public void eliminarCarta(Carta carta) {
		coleccion.remove(carta);	
		TrabajoArchivos.modificadorArchivos(coleccion);
	}

	@Override
	public void modificarCarta(Carta carta, ModificadorAtributos m) {
		carta.aceptar(m);
		TrabajoArchivos.modificadorArchivos(coleccion);
	}
	
	public void leerArchivo() {
		TrabajoArchivos.lectorArchivos(coleccion);
	}
	
	
	public void odenarRareza() {
		StrategyOrden estrategiaElegida = new OrdenPorRareza();
		estrategiaElegida.ordenar(coleccion);
	}
	
	public void ordenarPoder() {
		StrategyOrden estrategiaElegida = new OrdenPorPoder();
		estrategiaElegida.ordenar(coleccion);
	}
	
	public void ordenarNombre() {
		StrategyOrden estrategiaElegida = new OrdenPorNombre();
		estrategiaElegida.ordenar(coleccion);
	}
	
	
}
