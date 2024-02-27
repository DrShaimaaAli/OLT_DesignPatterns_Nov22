package Visitor;

public class OnlineCourse extends Course{

	private String courseContent = "Course Content";

	public String getCourseContent() {
		return courseContent;
	}

	public void setCourseContent(String courseContent) {
		this.courseContent = courseContent;
	}
	
	public void accept(CourseFormattingVisitor visitor)
	{
		visitor.FormateOnlineCourse(this);
	}
}
