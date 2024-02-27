package Memento;

public class Subject {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Memento creatMemento() {
		Memento m = new Memento();
		m.setState(state);
		return m;	
	}
	public void setMemento(Memento m)
	{
		this.setState(m.getState());
	}
}
