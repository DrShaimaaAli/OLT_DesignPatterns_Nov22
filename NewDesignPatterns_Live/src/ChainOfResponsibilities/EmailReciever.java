package ChainOfResponsibilities;

public class EmailReciever {
	
	MessageHandler handler;
	
	EmailReciever(MessageHandler handler)
	{
		this.handler = handler;
	}
	
	public void recieveEmail(String emailMessage)
	{
		String msg = handleEmail(emailMessage);
		
		System.out.println(msg);
	}
	
	public String handleEmail(String emailMessage)
	{    
		String confirmationMessage = handler.handleMessage(emailMessage);
		
		/*if (emailMessage.contains("spam") )
		{
			// logic to handle spam email
			confirmationMessage = "Moved to the spam folder";
		}
		else if (emailMessage.contains("fan"))
		{
			//logic to handle handle fan email
			confirmationMessage = "Posted as a testimony";
		}
		else if (emailMessage.contains("complaint"))
		{
			//logic to handle handle complaint email
			confirmationMessage = "Forwarded to the customer services";
		}
		else if (emailMessage.contains("newLoc"))
		{
			//logic to handle handle newLoc email
		    confirmationMessage = "Forwarded to suggestions and planning department";
		}
		else
		{
			// default handling logic
		    confirmationMessage = "Left in the inbox";
		}
		*/
		return confirmationMessage;
	}
}