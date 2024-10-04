public class Main
{
    public static void main(String[] args) 
    {

        Student student1 = new Student("Vedant", "Pawar", 101, 70, 1);
        Student student2 = new Student("Pankaj", "Mali", 102, 85, 1);
        Student student3 = new Student("Suraj", "Kadnar", 103, 55, 1);

        //course
        Course course = new Course("DSA", "R. B. W", 2024);

        //Enroll students
        course.enroll(student1);
        course.enroll(student2);
        // course.enroll(student3);

        // Enroll multiple students using the overloaded method
        Student[] newStudents = {student3};
        course.enroll(newStudents);

        //Print enrolled students
        course.printEnrolledStudents();
        System.out.println();

        //Unenroll a student
        course.unEnroll(student2);
        System.out.println();

        //Print enrolled students again
        System.out.println("New List: ");
        course.printEnrolledStudents();
        System.out.println();

        //Count students
        System.out.println("Total Students: " + course.countStudents());

        //Best grade
        System.out.println("Best Grade: " + course.bestGrade());

        //Average grade
        System.out.println("Average Grade: " + course.averageGrade());

        //Ranking
        course.ranking();

        //Above or Below Average
        course.aboveAverage();

    }

}