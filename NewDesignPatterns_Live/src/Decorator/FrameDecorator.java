package Decorator;

public abstract class FrameDecorator extends Frame{
	
	private Frame wrappedFrame;

	public Frame getWrappedFrame() {
		return wrappedFrame;
	}

	public void setWrappedFrame(Frame wrappedFrame) {
		this.wrappedFrame = wrappedFrame;
	}
	
}
