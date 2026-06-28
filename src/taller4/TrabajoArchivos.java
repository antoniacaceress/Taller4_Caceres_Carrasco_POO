package taller4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TrabajoArchivos {
	
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

	public static void modificadorArchivos(ArrayList<Carta> lista) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Sobres.txt"));
			for(Carta c : lista) {
				bw.write(c.toString());
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			System.out.println("Error al leer archivo" + e.getMessage());
		}
	}

}
