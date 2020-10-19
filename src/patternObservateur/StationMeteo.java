package patternObservateur;

public class StationMeteo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DonneesMeteo donneesMeteo = new DonneesMeteo();
		AffichageConditions affichageCond = new AffichageConditions(donneesMeteo);
		
		//AffichageStats affichageStat = new AffichageStats(donneesMeteo);
		//AffichagePrevisions affichagePrev = new AffichagePrevisions(donneesMeteo)
				
		donneesMeteo.setMesures(26, 65, 1020);
		donneesMeteo.setMesures(28, 70, 1012);
		donneesMeteo.setMesures(22, 90, 1012);		
	}

}
