package Memento;

import java.util.ArrayList;

public class TestDriver {

	public static void main(String[] args) {
		ArrayList<Memento> undoList = new ArrayList();
		
		Subject s = new Subject();
		
		s.setState("Initial");
		
		// checkpoint
		undoList.add(s.creatMemento());
		
		// clicked undo
		s.setMemento(undoList.get(0));
	}
}
