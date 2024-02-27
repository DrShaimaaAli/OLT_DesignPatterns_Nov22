package ChainOfResponsibilities;

public class SpamHandler extends MessageHandler{

	public  String handleMessage(String emailMessage)
	{
		// decide whether the request to handled here?
		// decide whether to pass it to the successor
		// handle the situation if there's no successors
		if (emailMessage.contains("spam") )
		{
			// logic to handle spam email
			return "Moved to the spam folder";
		}
		else
		{
			return passToSuccessor(emailMessage);
		}
		
	}
}
