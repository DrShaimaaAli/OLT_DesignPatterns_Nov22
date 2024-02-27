package Command;

import java.util.ArrayList;

public class TestDriver {
	public static void main(String[] args) {
		CopyCommand copyCmd = new CopyCommand();
		// add past, cut
		
		ArrayList<Command> contextMenu = new ArrayList();
		contextMenu.add(copyCmd);
		
		CopyableImage image = new CopyableImage("Logo");
		
		ArrayList<String> cells = new ArrayList<String>();
		cells.add("Cell_1");
		cells.add("Cell_2");
		cells.add("Cell_3");
		CopyableTable table = new CopyableTable(cells);
		
		
		// The user opened the context menu on the table and clicked copy
		copyCmd.setReciever(table);
		copyCmd.execute();
		
		// The user opened the context menu on the image and clicked copy
		copyCmd.setReciever(image);
		copyCmd.execute();

		
	}
}
