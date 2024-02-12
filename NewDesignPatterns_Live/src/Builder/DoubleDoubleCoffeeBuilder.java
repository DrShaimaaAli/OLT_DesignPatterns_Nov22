package Builder;

public class DoubleDoubleCoffeeBuilder extends CoffeeBuilder {

	
	public  void addMilk() {}
	public  void addCream()
	{
		cup.coffeeOrder.add("Cream");
		cup.coffeeOrder.add("Cream");
	}
	public  void addSugar()
	{
		cup.coffeeOrder.add("Sugar");
		cup.coffeeOrder.add("Sugar");
	}
	public  void addCoffee() {
		cup.coffeeOrder.add("Dark roast coffee");
	}
	
}
