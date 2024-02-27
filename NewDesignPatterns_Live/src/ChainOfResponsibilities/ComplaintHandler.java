package ChainOfResponsibilities;

public class ComplaintHandler extends MessageHandler{

	public  String handleMessage(String emailMessage)
	{
		// decide whether the request to handled here?
		// decide whether to pass it to the successor
		// handle the situation if there's no successors
		if (emailMessage.contains("complaint") )
		{
			//logic to handle handle complaint email
			return "Forwarded to the customer services";
		}
		else
		{
			return passToSuccessor(emailMessage);
		}
		
	}
}
