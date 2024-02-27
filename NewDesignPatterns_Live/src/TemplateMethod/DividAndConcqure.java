package TemplateMethod;

public abstract class DividAndConcqure {

	public void sort()
	{
		divide();
		sort_step();
		combine();
	}
	
	public abstract void divide();
	public abstract void sort_step();
	public abstract void combine();
}
