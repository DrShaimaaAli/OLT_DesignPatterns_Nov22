package ChainOfResponsibilities;

public class FanHandler extends MessageHandler{

	public  String handleMessage(String emailMessage)
	{
		// decide whether the request to handled here?
		// decide whether to pass it to the successor
		// handle the situation if there's no successors
		if (emailMessage.contains("fan") )
		{
			//logic to handle handle fan email
			return "Posted as a testimony";
		}
		else
		{
			return passToSuccessor(emailMessage);
		}
		
	}
}
