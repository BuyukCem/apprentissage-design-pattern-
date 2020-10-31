package patternFabriques;

public class PisseriaStyleMarseille extends Pizzeria{
	Pizza creerPizza(String item) {
		if (choix.equals(“fromage”)) {
			return new PizzaFromageStyleBrest();
		} else if (choix.equals(“vegetarienne”)) {
			return new PizzaVegetarienneStyleBrest(); 
		} else if (choix.equals(“fruitsDeMer”)) {
			return new PizzaFruitsDeMerStyleBrest(); 
		} else if (choix.equals(“poivrons”)) {
			return new PizzaPoivronsStyleBrest(); 
		} else return null;    
	}
}
