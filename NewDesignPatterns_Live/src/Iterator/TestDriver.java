package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class TestDriver {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("ABC");
		list.add("XYZ");
		list.add("LMN");
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext())
		{
			String el = itr.next();
			
			System.out.println(el);
		}
	}
}
