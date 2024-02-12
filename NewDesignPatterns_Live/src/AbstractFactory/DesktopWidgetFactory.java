package AbstractFactory;

public class DesktopWidgetFactory extends WidgetFactory{
	
	public Window windowFactory()
	{
		return new DesktopWindow();
	}

	public Scrollbar scrollbarFactory()
	{
		return new DesktopScrollbar();
	}

}
