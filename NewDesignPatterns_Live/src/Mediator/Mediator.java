package Mediator;

import java.util.ArrayList;

import Observer.Observer;


public class Mediator {
	ArrayList<Colleague> colleagues = new ArrayList<Colleague>();
	
	public void attach(Colleague c)
	{
		colleagues.add(c);
	}
	
	public void detach(Colleague c)
	{
		colleagues.remove(c);
	}
	
	public void Notify(Colleague updatedColleague)
	{
		for (Colleague c : colleagues)
			c.update(updatedColleague);
	}
	
}
