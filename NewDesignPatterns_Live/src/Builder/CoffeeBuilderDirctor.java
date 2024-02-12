package Builder;

public class CoffeeBuilderDirctor {
	
	public CoffeeCup getCoffeeCup(CoffeeBuilder builder)
	{
		builder.addSugar();
		builder.addMilk();
		builder.addCream();
		builder.addCoffee();
		
		return builder.getResult();
	}

}
