package Mediator;

public class PieChartView extends Colleague {

	public void update(Colleague updatedColleague)
	{
		System.out.println("PieChart state updated to: "+ updatedColleague.getState() );
	}
}
