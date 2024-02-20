package Decorator;

public class TestDriver {
	
	public static void drawFrame(Frame frame)
	{
		frame.drawTopBorder();
		frame.drawRightBorder();
		frame.drawLeftBorder();
		frame.drawBottomBorder();
	}
	
	
	public static void main(String[] args) {
		Frame frame = new RegularFrame();
		
		drawFrame(frame);
		
		System.out.println("================================");
		
		FrameColorDecorator decorator = new FrameColorDecorator();
		decorator.setColor("red");
		decorator.setWrappedFrame(frame);
		
		drawFrame(decorator);
		System.out.println("================================");
		
		FrameShadowDecorator shadowDecorator = new FrameShadowDecorator();
		shadowDecorator.setWrappedFrame(frame);
		drawFrame(shadowDecorator);
		
		System.out.println("================================");
		
		shadowDecorator = new FrameShadowDecorator();
		shadowDecorator.setWrappedFrame(decorator);
		drawFrame(shadowDecorator);
		
		
	}

}
