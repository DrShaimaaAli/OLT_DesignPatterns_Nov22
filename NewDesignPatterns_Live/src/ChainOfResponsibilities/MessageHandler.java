package ChainOfResponsibilities;

public abstract class MessageHandler {
	private MessageHandler successor;
	

	public abstract String handleMessage(String emailMessage);


	public MessageHandler getSuccessor() {
		return successor;
	}


	public void setSuccessor(MessageHandler successor) {
		this.successor = successor;
	}
	
	public String passToSuccessor(String emailMessage)
	{
		if (getSuccessor() != null)
			return getSuccessor().handleMessage(emailMessage);
		else
			return "Leave in Inbox";
	}
}
