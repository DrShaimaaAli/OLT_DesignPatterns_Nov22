package Visitor;

public class GraphicsFormatter extends CourseFormattingVisitor {
	
	public  void FormateInpersonCourse(InPersonCourse course) {
		String formatted = course.getCourseOutlines() + " with Graphic Formatting";
		course.setCourseOutlines(formatted);
	}
	
	public  void FormateOnlineCourse(OnlineCourse course) {
		String formatted = course.getCourseContent() + " with Graphic Formatting";
		course.setCourseContent(formatted);
	}
}
