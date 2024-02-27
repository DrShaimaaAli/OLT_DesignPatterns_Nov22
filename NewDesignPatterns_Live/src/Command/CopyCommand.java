package Command;

public class CopyCommand extends Command{

	private Copyable reciever;
	
	public void execute()
	{
		System.out.println("Open the clipboard");
		System.out.println("Save "+ reciever.copy() +" to the clipboard");
		System.out.println("Close the clipboard");
	}

	public Copyable getReciever() {
		return reciever;
	}

	public void setReciever(Copyable reciever) {
		this.reciever = reciever;
	}
}
