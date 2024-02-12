package AbstractFactory;

public class MobileWidgetFactory extends WidgetFactory{

	public Window windowFactory()
	{
		return new MobileWindow();
	}
	
	public Scrollbar scrollbarFactory()
	{
		return new MobileScrollbar();
	}
}
