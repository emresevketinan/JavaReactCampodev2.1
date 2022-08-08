
public class Main {

	public static void main(String[] args) {
		 Course course1=new Course(1,"Java / React","Engin");
		 
		 Course course2=new Course(2,"C# / Angular","Demirog");
		 
		 
		 Course[]courses= {course1,course2};
		 
		 for ( Course course : courses) {
			System.out.println(course.id);
			System.out.println(course.name);
			System.out.println(course.insructor);
			System.out.println("*************************");
		}

		 
		 CourseManager courseManager=new CourseManager();
		 courseManager.CourseStart(course1);
		 courseManager.CourseStart(course2);
		 
		 courseManager.FinishContinue(course1);
		 courseManager.FinishContinue(course2);
		 
	}

}
