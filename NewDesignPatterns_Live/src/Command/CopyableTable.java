package Command;

import java.util.ArrayList;

public class CopyableTable extends Copyable{
	ArrayList<String> cells;
	
	CopyableTable(ArrayList<String> cells)
	{
		this.cells = cells;
	}
	
	public String copy()
	{
		return cells.toString();
	}

}
