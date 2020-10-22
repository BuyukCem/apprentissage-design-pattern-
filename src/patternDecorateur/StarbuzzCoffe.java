package patternDecorateur;

public class StarbuzzCoffe {
	public static void main(String args[]) {
		Boisson boisson = new Espresso();
		System.out.println(boisson.getDesctiption()+" €"+ boisson.Cout());
		
		Boisson boisson2 = new Sumatra();
		boisson2 = new Chocolat(boisson2);
		boisson2 = new Lait(boisson2);
	
		System.out.println(boisson2.getDesctiption()+" €"+ boisson2.Cout());
	}
}
