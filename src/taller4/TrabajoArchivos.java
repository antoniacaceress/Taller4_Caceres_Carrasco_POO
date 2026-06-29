package taller4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Esta clase se encarga de trabajar todo lo que se trata
 * de archivos utilizados en el programa.
 * @author AntoniaCaceres
 */
public class TrabajoArchivos {
	
	/**
	 * Este método se encarga de leer el archivo principal del programa.
	 * @param lista 
	 * @return
	 */
	public static ArrayList<Carta> lectorArchivos(ArrayList<Carta> lista) {
		FactoryCarta factory = new FactoryCarta();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("Sobres.txt"));
			String linea;
			
			while ((linea = br.readLine()) != null) {
				String[] partes = linea.split(";");
				Carta carta = factory.crearCarta(partes);
				lista.add(carta);
			}
			br.close();
			
		} catch (IOException e) {
			System.out.println("Error al leer el archivo " + e.getMessage());
		}
		return lista;
	}

	/**
	 * Este método se encarga de modificar el archivo de texto
	 * cada vez que se realiza algún cambio en él.
	 * @param lista
	 */
	public static void modificadorArchivos(ArrayList<Carta> lista) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Sobres.txt"));
			for(Carta c : lista) {
				bw.write(c.toString());
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			System.out.println("Error al reescribir el archivo" + e.getMessage());
		}
	}

}
