package Builder;

public abstract class CoffeeBuilder {

	protected CoffeeCup cup;
	
	CoffeeBuilder()
	{
		cup = new CoffeeCup();
	}
	
	public CoffeeCup getResult()
	{
		return cup;
	}
	
	public abstract void addMilk();
	public abstract void addCream();
	public abstract void addSugar();
	public abstract void addCoffee();
}
