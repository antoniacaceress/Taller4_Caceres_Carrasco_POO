package taller4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SistemaImpl implements Sistema {

	private static SistemaImpl instancia;
	private ArrayList<Carta> coleccion;
	
	private SistemaImpl() {
		coleccion = new ArrayList<>();
	}
	
	public static SistemaImpl getInstancia() {
		if (instancia == null) {
			instancia = new SistemaImpl();
		}
		return instancia;
	}

	@Override
	public void agregarCarta(Carta carta) {
		coleccion.add(carta);
	}

	@Override
	public void eliminarCarta(Carta carta) {
		coleccion.remove(carta);	
	}

	@Override
	public void modificarCarta(Carta carta) {

	}
	
	public void leerArchivo() {
		FactoryCarta factory = new FactoryCarta();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("Sobres.txt"));
			String linea;
			
			while ((linea = br.readLine()) != null) {
				String[] partes = linea.split(";");
				Carta carta = factory.crearCarta(partes);
				coleccion.add(carta);
			}
			br.close();
			
		} catch (IOException e) {
			System.out.println("Error al leer el archivo " + e.getMessage());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
