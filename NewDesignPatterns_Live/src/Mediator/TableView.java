package Mediator;

public class TableView extends Colleague {

	public void update(Colleague updatedColleague)
	{
		System.out.println("TableView state updated to: "+ updatedColleague.getState() );
	}
}
