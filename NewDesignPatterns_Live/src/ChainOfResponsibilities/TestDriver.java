package ChainOfResponsibilities;

public class TestDriver {
	
	public static void main(String[] args) {
				
		//Configuring the chain
		//1. which handlers to use
		FanHandler fanHandler = new FanHandler();
		SpamHandler spamHandler = new SpamHandler();
		ComplaintHandler complaintHandler = new ComplaintHandler();
		
		//2. what is the order of the handlers
		//fanHandler.setSuccessor(spamHandler);
		//spamHandler.setSuccessor(complaintHandler);
		spamHandler.setSuccessor(fanHandler);
		fanHandler.setSuccessor(complaintHandler);
		
		//3.configure the client to one of the handlers as a starting point
		
		EmailReciever reciever = new EmailReciever(spamHandler);
		reciever.recieveEmail("spam fan Message");
	}
}
