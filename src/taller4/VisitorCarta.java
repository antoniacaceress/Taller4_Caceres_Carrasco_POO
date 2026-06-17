package taller4;

public interface VisitorCarta {

	double visitar(Pokemon pokemon);
	double visitar(Item item);
	double visitar(Supporter supporter);
	double visitar(Energy energy);
	
}
