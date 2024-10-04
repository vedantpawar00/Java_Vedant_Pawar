import java.util.ArrayList;

public class Course 
{
    String courseName;
    String professorName;
    int year;
    ArrayList<Student> enrolledStudents;
    // Student[] enrolledStudents;
    // int studentCount;

    public Course(String courseName, String professorName, int year) 
    {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
        this.enrolledStudents = new ArrayList<>();
        // this.enrolledStudents = new Student[30];
        // this.studentCount = 0;
    }

    public void enroll(Student student) 
    {
        enrolledStudents.add(student);
        System.out.println(student.firstName + " has been enrolled in " + courseName);
    }

    //method overload
    public void enroll(Student[] students) 
    {
        for(int i=0; i<students.length; i++)
        {
            enroll(students[i]);
        }
    }

    public void unEnroll(Student student) 
    {
        if (enrolledStudents.remove(student)) 
        {
            System.out.println(student.firstName + " has been unenrolled from " + courseName);
        } 
        else 
        {
            System.out.println(student.firstName + " is not enrolled in " + courseName);
        }
    }

    public int countStudents() 
    {
        return enrolledStudents.size();
    }

    public int bestGrade() 
    {
        int best = 0;
        for (int i = 0; i < enrolledStudents.size(); i++) 
        {
            Student student = enrolledStudents.get(i);
            if (student.getGrade() > best) 
            {
                best = student.getGrade();
            }
        }
        return best;
    }

    //Challenge 1: calculates the average grade:
    public double averageGrade() 
    {
        double total = 0;
        for (int i = 0; i < enrolledStudents.size(); i++) 
        {
            total += enrolledStudents.get(i).getGrade();
            // Student student = enrolledStudents.get(i);
            // total += student.getGrade();
        }
        return total / enrolledStudents.size();
    }

    public void printEnrolledStudents() 
    {
        System.out.println("Enrolled Students in " + courseName + ":");
        for (int i = 0; i < enrolledStudents.size(); i++) 
        {
            Student student = enrolledStudents.get(i);
            System.out.println(student.firstName + " " + student.lastName);
        }
    }
    
    //Challenge 2:
    public void ranking()
    {
        // if (enrolledStudents.isEmpty()) {
        //     System.out.println("No students enrolled in this course.");
        //     return;
        // }
        // Student[] rankStudents = new Student[];
        for(int i=0; i<enrolledStudents.size()-1; i++)
        {
            for(int j=0; j<enrolledStudents.size()-1-i; j++)
            {
                if(enrolledStudents.get(j).getGrade() < enrolledStudents.get(j+1).getGrade())
                {
                    Student temp = enrolledStudents.get(j);
                    enrolledStudents.set(j, enrolledStudents.get(j+1));
                    enrolledStudents.set(j+1, temp);
                }
            }
        }
        System.out.println("Ranking of students in " + courseName + ": ");
        for(int i=0; i<enrolledStudents.size(); i++)
        {
            Student student = enrolledStudents.get(i);
            System.out.println((i+1) + "." + student.firstName + " " + student.lastName + " -Grade: " + student.getGrade());
        }
    }


    //Challenge 3:
    public void aboveAverage()
    {
        double av = averageGrade();
        System.out.println("Course average grade: " + av);
        
        for(int i=0; i<enrolledStudents.size(); i++)
        {
            Student student = enrolledStudents.get(i);
            String status;
            if(student.getGrade() >= av)
            {
                status = "Above";
            }
            else
            {
                status = "Below";
            }
            System.out.println(student.firstName + " " + student.lastName + " is " + status + " Average");
        }
    }


}
