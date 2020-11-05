package Homework;

public class Course implements Cloneable{
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents(){
        return students;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public String getCourseName(){
        return courseName;
    }

    @Override
    public Object clone(){
    	Course course = null;
        try{
            course = (Course)super.clone();
            course.courseName = courseName;
            course.numberOfStudents = numberOfStudents;
            course.students = students.clone();
        }
        catch(CloneNotSupportedException ex){

        }
        return course;
    }

}



