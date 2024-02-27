package Mediator;

public class Data extends Colleague{
	private String state;

	
	public void update(Colleague updatedColleague)
	{
		System.out.println("Data state updated to: "+ updatedColleague.getState() );
	}
}
