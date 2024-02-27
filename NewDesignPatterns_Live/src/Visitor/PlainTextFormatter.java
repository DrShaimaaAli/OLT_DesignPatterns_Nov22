package Visitor;

public class PlainTextFormatter extends CourseFormattingVisitor {
	public  void FormateInpersonCourse(InPersonCourse course) {
		String formatted = course.getCourseOutlines() + " with PlainText Formatting";
		course.setCourseOutlines(formatted);
	}
	
	public  void FormateOnlineCourse(OnlineCourse course) {
		String formatted = course.getCourseContent() + " with PlainText Formatting";
		course.setCourseContent(formatted);
	}


}
