package patternStrategie;

public class Colvert extends Canard {
	public Colvert() {
		comportementCancan = new Cancan();
		comportementVol = new VolerAvecDesAiles();
	}

	@Override
	public void afficher() {
				
	}
	
}
