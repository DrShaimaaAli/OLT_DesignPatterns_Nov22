package Facade;

public class SecureTransferFacade {

	private ContentTransfer transfer = new ContentTransfer();
	private Crypto crypto = new Crypto();
	
	public void secureUpload(String content)
	{
		transfer.upload(crypto.encrypt(content));
	}
	
	public void secureDownload(String content)
	{
		transfer.download(crypto.decrypt(content));
	}
}
