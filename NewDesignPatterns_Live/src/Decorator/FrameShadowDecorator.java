package Decorator;

public class FrameShadowDecorator extends FrameDecorator{
	
	public void drawTopBorder() {
		getWrappedFrame().drawTopBorder();
	}
	public void drawBottomBorder()
	{
		getWrappedFrame().drawBottomBorder();
		System.out.println("Add shadow ");
	}
	public void drawLeftBorder()
	{
		getWrappedFrame().drawLeftBorder();
		System.out.println("Add shadow ");
	}
	public void drawRightBorder() {
		getWrappedFrame().drawRightBorder();
	}

}
