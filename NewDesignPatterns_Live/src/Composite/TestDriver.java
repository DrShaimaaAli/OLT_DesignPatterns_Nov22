package Composite;

public class TestDriver {
	public static void main(String[] args) {
		Directory home = new Directory("Home");
		File readme = new File("ReadMe.txt", "Some instructions");
		home.addChilde(readme);
		home.addChilde(new File("contacts.txt", "Some contacts"));
		home.addChilde(new Directory("SubDir"));
		
		
		home.display();
		home.open();
		
		readme.display();
	}

}
