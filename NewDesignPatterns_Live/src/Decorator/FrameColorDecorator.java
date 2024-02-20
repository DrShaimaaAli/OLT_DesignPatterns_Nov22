package Decorator;

public class FrameColorDecorator extends FrameDecorator{

	private String color;
	
	public  void drawTopBorder() {
		System.out.println("Draw top border in :" + color);
	}
	public  void drawBottomBorder()
	{
		System.out.println("Draw bottom borderin :" + color);
	}
	public  void drawLeftBorder()
	{
		System.out.println("Draw left border in :" + color);
	}
	
	public  void drawRightBorder()
	{
		System.out.println("Draw right borderin :" + color);
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
	
