package Mediator;

public class TestDriver {
	public static void main(String[] args) {
		Data d = new Data();
		TableView table = new TableView();
		PieChartView pie = new PieChartView();
		
		Mediator m = new Mediator();
		m.attach(table);
		m.attach(pie);
		m.attach(d);
		
		d.setMed(m);
		table.setMed(m);
		pie.setMed(m);
		
		d.setState("ABC");
		
		System.out.println("================");
		table.setState("XYZ");
		
		System.out.println("================");
		pie.setState("123");
		
		
	}
}
