package Proxy;

public class TestDriver {
	
	public static void viewDocument(Document doc)
	{
		doc.loadFile();
	}
	
	public static void main(String[] args) {
		WordDocument word = new WordDocument();
		word.text.add("Line 1");
		word.text.add("Line 2");
		word.text.add("Line 3");
		
		word.images.add("Image 1");
		word.images.add("Image 2");
		word.images.add("Image 3");
		
		viewDocument(word);
		
		System.out.println("###########################");
		
		viewDocument(new DocumentProxy(word));
	
	}

}
