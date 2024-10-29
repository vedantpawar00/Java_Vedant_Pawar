import java.util.ArrayList;
import java.util.List;

abstract class Person
{
    abstract void details();
}

class Student extends Person
{
    String name;
    public Student(String name)
    {
        this.name = name;
    }

    void details()
    {
        System.out.println("student " + this.name);
    }
}

class Employee extends Person
{
    String name;
    public Employee(String name)
    {
        this.name = name;
    }

    void details()
    {
        System.out.println("employee " + this.name);
    }
}

public class Generics2 
{
    public static void main(String[] args) 
    {
        List<Student> stud = new ArrayList<Student>();
        stud.add(new Student("stud"));
        printA(stud);

        List<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee("emp"));
        printA(emp);
    }   

    public static void printA(List<? extends Person> templist)
    {
        System.out.println("Details");
        for(Person item:templist)
        {
            item.details();
        }
    }
}
