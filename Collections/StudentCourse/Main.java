public class Main 
{
    public static void main(String[] args) 
    {
        CourseService courseService = new CourseService();

        String coursesId = "math1";
        String studentId = "111";

        courseService.displayCourseInformation(coursesId);
        courseService.displayStudentInformation(studentId);

        System.out.println("Enrolled Students:");
        courseService.enrollStudent(studentId, coursesId);
        courseService.displayStudentInformation(studentId);

        System.out.println("Un-Enrolled Students:");
        courseService.unEnrollStudent(studentId, coursesId);
        courseService.displayStudentInformation(studentId);

    }
}
