package Composite;

public abstract class FileResource {
	
	String name;
	
	public FileResource(String name)
	{
		this.name = name;
	}
	
	public void  display()
	{
		System.out.println("File: " + name);	
	}
	public abstract void  open();
// other functions common to any file

}
