import java.util.ArrayList;

public class TestDriver {

	public static void main(String[] args) {
		/*
		UserPrefs prefs1 = UserPrefs.getInstance();
		
		prefs1.setPrefColor("Red");
		
		UserPrefs prefs2 = UserPrefs.getInstance();
		
		prefs2.setPrefColor("Green");
		
		System.out.println("Pref1 color:" +prefs1.getPrefColor() );
		System.out.println("Pref2 color:" +prefs2.getPrefColor() );
		*/
		
		ArrayList<ArrayList<String>> names = new ArrayList<>();
		ArrayList<String> firstList = new ArrayList<String>();
		firstList.add("Alice");
		ArrayList<String> secondList = new ArrayList<String>();
		secondList.add("Bob");
		
		names.add(firstList);
		names.add(secondList);
		ArrayList<String> namesCopy = (ArrayList<String> ) names.clone();
		
		System.out.println(">>>>>> Before: ");
		System.out.println(names);
		System.out.println(namesCopy);
		
		names.get(0).add("John");
		
		System.out.println(">>>>>> After: ");
		System.out.println(names);
		System.out.println(namesCopy);
		
	}
}
