package AbstractFactory;

public class DesktopApp extends Application {
	
	DesktopApp()
	{
		this.factory = new DesktopWidgetFactory();
	}
}
