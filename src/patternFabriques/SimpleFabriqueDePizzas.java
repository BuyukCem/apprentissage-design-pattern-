package patternFabriques;

public class SimpleFabriqueDePizzas {
	
		
	public Pizza creerPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("fromage")) {
			pizza = new PizzaFromage();
		} else if(type.equals("poivrons")) {
			pizza = new PizzaPoivrons();
		} else if (type.equals(“fruitsDeMer”)) {
			pizza = new PizzaFruitsDeMer();	
		} else if (type.equals(“vegetarienne”)) {
			pizza = new PizzaVegetarienne();
		}      
		return pizza;
	}
}
