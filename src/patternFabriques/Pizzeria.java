package patternFabriques;

public abstract class Pizzeria {
	
	public Pizza commanderPizzas(String type) {
		Pizza pizza;
		
		pizza = creerPizza(type);
		pizza.preparer();
		pizza.cuire();
		pizza.couper();
		pizza.emballer();
	
		return pizza;
	}
	protected abstract Pizza creerPizza(String type);
}
	