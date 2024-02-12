package FactoryMethod;

public class TestDriver {
	
	public static void anotherLayer(OfficeApp app)
	{
		// complex logic on top of the app-doc structure
		app.newDocument();
	}

	public static void main(String[] args) {
		OfficeApp app;
		
		app = new WordApp();
		app.newDocument();
		
		app = new ExcelApp();
		app.newDocument();
		
		anotherLayer(new WordApp());
		anotherLayer(new ExcelApp());
	}
}
