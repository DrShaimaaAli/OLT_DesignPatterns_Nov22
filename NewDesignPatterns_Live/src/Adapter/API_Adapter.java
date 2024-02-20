package Adapter;

public class API_Adapter extends Original_API{
	UpdateAPI updated = new UpdateAPI();
	
	public void service()
	{
		updated.updateService();
	}

}
