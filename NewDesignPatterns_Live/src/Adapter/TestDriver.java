package Adapter;

public class TestDriver {
	
	public static void API_Client(Original_API api)
	{
		api.service();
	}
	
	public static void main(String[] args) {
		
		API_Client(new Original_API());
		System.out.println("========================");
		API_Client(new API_Adapter());
	}

}
