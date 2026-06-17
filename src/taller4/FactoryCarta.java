package taller4;

public class FactoryCarta {
		
	public Carta crearCarta(String[] partes) {
		
		String nombre = partes[0];
		int rareza = Integer.parseInt(partes[1]);
		String tipo = partes[2];
		
		switch(tipo) {
		
		case "Pokemon":
			int daño = Integer.parseInt(partes[3]);
			int cantEnergias = Integer.parseInt(partes[4]);	
			return new Pokemon(nombre, rareza, tipo, daño, cantEnergias);
		
		case "Item":
			int bonificacion = Integer.parseInt(partes[3]);
			return new Item(nombre, rareza, tipo, bonificacion);
			
		case "Supporter":
			int efectosPorTurno = Integer.parseInt(partes[3]);
			return new Supporter(nombre, rareza, tipo, efectosPorTurno);
		
		case "Energy":
			String elemento = partes[3];
			return new Energy(nombre, rareza, tipo, elemento);
			
		default:
			throw new IllegalArgumentException("Tipo de carta desconocido: " + tipo);
        }			
			
		}

}
