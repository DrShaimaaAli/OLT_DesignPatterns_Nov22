package Observer;

public class TableView extends Observer {

	public void update(Subject updated)
	{
		System.out.println("Table view state: "+ updated.getState());
	}

}
