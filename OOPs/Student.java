public class Student 
{
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;

    // Constructor default
    public Student()
    {
        this.firstName = "";
        this.lastName = "";
        this.registration = 0;
        this.grade = 0;
        this.year = 1;
    }

    // Constructor with 2
    public Student(String firstName, String lastName) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = 0;
        this.grade = 0;
        this.year = 1;
    }

    // Constructor with all 
    public Student(String firstName, String lastName, int registration, int grade, int year)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }


    public void printFullName()
    {
        System.out.println("Full name: " + firstName + " " + lastName);
    }
    public boolean isApproved()
    {
        return grade >= 60;
    }
    public int changeYearIfApproved()
    {
        if(grade >= 60)
        {
            year += 1;
            System.out.println("Congratulations");
        }
        else
        {
            System.out.println("No");
        }
        return year;
    }
    public int getGrade() 
    {
        return grade;
    }
    public String toString() 
    {
        return firstName + " " + lastName + " (Grade: " + grade + ")";
    }

    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.printFullName();
        s1.changeYearIfApproved();

        Student s2 = new Student("Vedant", "Pawar");
        s2.printFullName();
        s2.changeYearIfApproved();

        Student s3 = new Student("Vedant", "Pawar", 101, 80, 2);
        s3.printFullName();
        if(s3.isApproved())
        {
            System.out.println("Approved");
        }
        else
        {
            System.out.println("Not Approved");
        }
        s3.changeYearIfApproved();
    }
}
