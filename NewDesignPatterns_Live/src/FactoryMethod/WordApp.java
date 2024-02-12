package FactoryMethod;

public class WordApp extends OfficeApp {

	public  Document documentFactory()
	{
		return new WordDoc();
	}
}
