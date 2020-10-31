package patternFabriques;

public class PisseriaFrommageStyleStrasbourg extends Pizza{

	public void PizzaFromageStyleBrest() {
		nom = "Pizza pâte style Strasbourg et fromag";
		pate = "Extra épaisse";
		sauce = "Sauce aux tomates cerise";
		garnitures.add("Lamelles de mozzarella");
		
	}

	void couper() {
		System.out.println("Découpage en parts carrées");
	}
}
