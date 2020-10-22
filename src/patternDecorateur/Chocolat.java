package patternDecorateur;

public class Chocolat extends DecorateurIngredient {
	Boisson boisson;
	

	public Chocolat(Boisson boisson) {
		this.boisson  = boisson;
	}
	
	
	public String getDesctiption() {	
	
		return boisson.getDesctiption() + ", chocolat";
	}

	
	public double Cout() {	
		return .20 + boisson.Cout();
	}

}
