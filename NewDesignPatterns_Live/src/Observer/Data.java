package Observer;

public class Data extends Subject{
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		this.Notify();
	}
	
}
