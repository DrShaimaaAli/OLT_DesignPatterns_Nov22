package Builder;

public class RegularCoffeBuilder extends CoffeeBuilder{

	

	public  void addMilk() {
		cup.coffeeOrder.add("Milk");
	}
	public  void addCream()
	{
	
	}
	public  void addSugar()
	{
		cup.coffeeOrder.add("Sugar");
	}
	public  void addCoffee() {
		cup.coffeeOrder.add("Dark roast coffee");
	}
	
}
