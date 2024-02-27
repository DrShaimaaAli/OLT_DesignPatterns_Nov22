package Mediator;

public abstract class Colleague {

	private Mediator med;
	
	String state;
	
	public String getState()
	{
		return this.state;
	}
	
	public void setState(String state)
	{
		this.state = state;
		med.Notify(this);
	}
	
	public abstract void update(Colleague updatedColleague);

	public Mediator getMed() {
		return med;
	}

	public void setMed(Mediator med) {
		this.med = med;
	}
}
