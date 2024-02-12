package AbstractFactory;

public class TestDriver {

	public static void nextLayer(Application app)
	{
		// complicated logic 
		app.openWindow();
	}
	public static void main(String[] args) {
		nextLayer(new DesktopApp());
		System.out.println("==================================");
		nextLayer(new MobileApp());
	}
}
