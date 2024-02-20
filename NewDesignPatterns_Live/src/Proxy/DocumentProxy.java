package Proxy;

public class DocumentProxy extends Document{
	WordDocument doc;
	
	public DocumentProxy(){}
	public DocumentProxy(WordDocument doc){
		this.doc = doc;
	}
	
	public void loadFile()
	{
		for (String t : doc.text)
			System.out.println(t);
		
		System.out.println("===========================");
		
		for (String i : doc.images)
		{
			System.out.println("Wait for the trigger ..... ");
			System.out.println(i);
		}
	}

}
