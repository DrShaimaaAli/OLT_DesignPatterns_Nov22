package Facade;

public class Crypto {

	public String encrypt(String content)
	{
		return "Encrypted version of " + content;
	}
	
	public String decrypt(String content)
	{
		return "Decrypted version of " + content;
	}
	
}
