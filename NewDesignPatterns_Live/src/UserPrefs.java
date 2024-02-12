
public class UserPrefs {
	private static UserPrefs singlton;
	
	private String prefColor;
	private String prefFont;
	
	private UserPrefs() {}
	
	public static UserPrefs getInstance()
	{
		if (singlton == null)
			singlton = new UserPrefs();
		
		return singlton;	
	}

	public String getPrefColor() {
		return prefColor;
	}

	public void setPrefColor(String prefColor) {
		this.prefColor = prefColor;
	}

	public String getPrefFont() {
		return prefFont;
	}

	public void setPrefFont(String prefFont) {
		this.prefFont = prefFont;
	}

}
