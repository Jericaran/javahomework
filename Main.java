package Homework;

public class Main {
	public static void main(String[] args){
		Course course = new Course("student");
		for(int i = 0; i < 10; ++i)
			course.addStudent(i + "studentname");

	        Course name = (Course)course.clone();
	        name.addStudent("zhangsan");
	        System.out.println(course.getNumberOfStudents());
	        System.out.println(name.getNumberOfStudents());
	    }
	
}

