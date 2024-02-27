package Command;

public class CopyableImage extends Copyable{
	String imageName;
	
	public CopyableImage(String imageName)
	{
		this.imageName = imageName;
	}
	
	public String copy()
	{
		return this.imageName + " Compressed Copy";
	}

}
