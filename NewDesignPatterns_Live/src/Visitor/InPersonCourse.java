package Visitor;

public class InPersonCourse extends Course{

	private String courseOutlines = "Course Outlines";

	public String getCourseOutlines() {
		return courseOutlines;
	}

	public void setCourseOutlines(String courseOutlines) {
		this.courseOutlines = courseOutlines;
	}
	
	public void accept(CourseFormattingVisitor visitor)
	{
		visitor.FormateInpersonCourse(this);
	}
	
}
