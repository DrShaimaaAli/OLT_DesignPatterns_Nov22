package FactoryMethod;

public abstract class OfficeApp {
	
	public abstract Document documentFactory();

	public void newDocument()
	{
		// common code
		Document doc = documentFactory();
		
		doc.open();
		
		// other common code
	}
}
