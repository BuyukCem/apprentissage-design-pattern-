package patternStrategie;

public abstract class Canard {
	ComportementVol comportementVol;
	ComportementCancan comportementCancan;
	
	public Canard() {
		
	}

	public abstract void afficher ();
		
	public void effectuerVol () {
		comportementVol.voler();
	}
	
	public void effectuerCancan() {
		comportementCancan.cancaner();
	}
	
	public void nager () {
		System.out.println("Tous les canards flottent, même les leurres !!");
	}
	
	public void setComportementVol(ComportementVol cv) {
		comportementVol = cv;
	}
	public void setComportementCancan(ComportementCancan cc) {
		comportementCancan = cc;
	}
}
