package Observer;

public class PieChartView extends Observer {

	public void update(Subject updated)
	{
		System.out.println("PieChartView state: "+ updated.getState());
	}
}
