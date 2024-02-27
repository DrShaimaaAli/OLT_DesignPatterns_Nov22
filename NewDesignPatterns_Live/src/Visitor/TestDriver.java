package Visitor;

public class TestDriver {
	public static void main(String[] args) {
		OnlineCourse online = new OnlineCourse();
		System.out.println("Before: " + online.getCourseContent());
		
		InPersonCourse inperson = new InPersonCourse();
		System.out.println("Before: " + inperson.getCourseOutlines());
		
		online.accept(new GraphicsFormatter());
		System.out.println("After: " + online.getCourseContent());
		
		inperson.accept(new GraphicsFormatter());
		System.out.println("After: " + inperson.getCourseOutlines());
		
		
	}
}
