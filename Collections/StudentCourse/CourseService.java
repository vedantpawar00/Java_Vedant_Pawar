import java.util.HashMap;

public class CourseService 
{
    HashMap<String, Student> students = new HashMap<>();
    HashMap<String, Course> courses = new HashMap<>();

    public CourseService()
    {
        students.put("111", new Student("mohan", "111"));
        students.put("222", new Student("rahul", "222"));

        courses.put("math1", new Course("Maths", "math1", 10));
        courses.put("phy1", new Course("Physics", "phy1", 10));
    }

    public void enrollStudent(String studentId, String courseId)
    {
        Student student = students.get(studentId);
        Course course = courses.get(courseId);

        student.enroll(course);
        System.out.println("Student " + studentId + " enrolled in " + courseId);
        
    }

    public void unEnrollStudent(String studentId, String courseId)
    {
        Student student = students.get(studentId);
        Course course = courses.get(courseId);

        student.unenroll(course);
        System.out.println("Student " + studentId + " unenrolled in " + courseId);
    }

    public void displayCourseInformation(String courseId)
    {
        Course course = courses.get(courseId);
        System.out.println(course);
    }

    public void displayStudentInformation(String studentId)
    {
        Student student = students.get(studentId);
        System.out.println(student);
    }


}
