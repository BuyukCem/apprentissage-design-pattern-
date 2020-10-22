package patternDecorateur;

public class Lait extends DecorateurIngredient{
	Boisson boisson;
	
	public Lait(Boisson boisson) {
		this.boisson  = boisson;
	}
	
	@Override
	public String getDesctiption() {
		return boisson.getDesctiption() + ", lait";
	}
	
	@Override
	public double Cout() {
		return 1.32 + boisson.Cout();
	}

}
