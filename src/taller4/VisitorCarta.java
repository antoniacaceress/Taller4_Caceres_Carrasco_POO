package taller4;
/**
 * Esta interfaz permite visitar cada carta dependiendo de su tipo
 * y así poder relizar cálculos sin modificar las clases originales.
 * @author AntoniaCaceres
 */
public interface VisitorCarta {

	double visitar(Pokemon pokemon);
	double visitar(Item item);
	double visitar(Supporter supporter);
	double visitar(Energy energy);
	
}
