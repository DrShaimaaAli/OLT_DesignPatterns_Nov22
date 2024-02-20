package Composite;

public class File extends FileResource{

	
	String content;
	
	public File(String name,String content) {
		super(name);
		
		this.content = content;
	}
	
	
	public void open()
	{
		System.out.println(this.content);
		System.out.println("============================");
	}
}
