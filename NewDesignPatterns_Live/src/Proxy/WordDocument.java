package Proxy;

import java.util.ArrayList;

public class WordDocument extends Document{
	
	public ArrayList<String> text= new ArrayList<String>();
	public ArrayList<String> images= new ArrayList<String>();
	
	public void loadFile()
	{
		for (String t : text)
			System.out.println(t);
		
		System.out.println("===========================");
		
		for (String i : images)
			System.out.println(i);
	}

}
