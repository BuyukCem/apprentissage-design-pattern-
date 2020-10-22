package patternDecorateur;

public abstract class Boisson {
	protected String description = "Boisson inconnue";
	protected int Taille = 1;
	public String getDesctiption() {
		return description;
	}
	
	public abstract double Cout();
}
