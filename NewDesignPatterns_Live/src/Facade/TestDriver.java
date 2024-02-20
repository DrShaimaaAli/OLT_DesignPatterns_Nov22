package Facade;

public class TestDriver {
	public static void main(String[] args) {
		SecureTransferFacade facade = new SecureTransferFacade();
		
		facade.secureUpload("MY Content");
		facade.secureDownload("MyContent");
	}

}
