package patternStrategie;

public class MiniSimulateur {

	public static void main(String[] args) {
		
		Canard colvert = new Colvert();
		colvert.effectuerCancan();
		colvert.effectuerVol();
		
				
		Canard CanardEnPlastique = new CanardEnPlastique();
		CanardEnPlastique.setComportementVol(new PropulsionAReaction());
		CanardEnPlastique.effectuerVol();
	}

}
