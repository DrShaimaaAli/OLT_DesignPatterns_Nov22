package Observer;

public class TestDriver {
	public static void main(String[] args) {
		Data d = new Data();
		
		TableView table = new TableView();
		PieChartView pie = new PieChartView();
		
		d.attach(table);
		d.attach(pie);
		
		d.setState("ABC");
		
		System.out.println("================");
		d.setState("XYZ");
		
	}
}
