package Builder;

public class TestDriver {

	public static void main(String[] args) {
		CoffeeCup resultCup;
		
		CoffeeBuilder builder;
		
		CoffeeBuilderDirctor director = new CoffeeBuilderDirctor();
		
		builder = new DoubleDoubleCoffeeBuilder();
		resultCup = director.getCoffeeCup(builder);
		System.out.println(resultCup.coffeeOrder);
		
		System.out.println("==========================");
		
		builder = new RegularCoffeBuilder();
		resultCup = director.getCoffeeCup(builder);
		System.out.println(resultCup.coffeeOrder);
		
	}
}
