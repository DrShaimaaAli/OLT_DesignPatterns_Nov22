package Strategy;

public class TestDriver {
	public static void main(String[] args) {
		SortAlgorithm sortingAlgorithm;
		
		sortingAlgorithm = new MergeSort();//new BubbleSort();
		
		sortingAlgorithm.sort();
	}
}
