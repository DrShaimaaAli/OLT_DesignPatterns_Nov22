package Composite;

import java.util.ArrayList;

public class Directory extends FileResource{

	ArrayList<FileResource> children = new ArrayList<FileResource>();
	
	public Directory(String name)
	{
		super(name);
	}
	
	public void addChilde(FileResource child)
	{
		children.add(child);
	}
	public void removeChilde(FileResource child)
	{
		children.remove(child);
	}
	
	
	public void open()
	{
		for (FileResource f : children)
			f.display();
	}
}
