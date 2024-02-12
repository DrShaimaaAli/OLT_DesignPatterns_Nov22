package AbstractFactory;

public class MobileApp extends Application {
	
	MobileApp(){
		this.factory = new MobileWidgetFactory();
	}
}
