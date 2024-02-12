package AbstractFactory;

public abstract class Application {
	
	WidgetFactory factory;
	
	public void openWindow()
	{
		Window window = factory.windowFactory();
		Scrollbar scroll = factory.scrollbarFactory();
		
		window.display();
		scroll.setLoc(0);
	}
	

}
