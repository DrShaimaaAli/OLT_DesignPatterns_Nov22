package Observer;

import java.util.ArrayList;

public abstract class Subject {
	ArrayList<Observer> observers = new ArrayList();
	
	public void attach(Observer observer)
	{
		observers.add(observer);
	}
	public void detach(Observer observer)
	{
		observers.remove(observer);
	}
	
	public abstract String getState();
	
	public void Notify()
	{
		for (Observer o : observers)
			o.update(this);
	}

}
