public class Employee implements UserInterface
{
    String firstName;
    String lastName;
    int registration;
    int age;
    int daysWorked;
    int vacationDaysTaken;
    double salary;
    int yearsWorked;
    private String username;
    private String password;


    public Employee(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken, double salary, int yearsWorked, String username, String password) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.age = age;
        this.daysWorked = daysWorked;
        this.vacationDaysTaken = vacationDaysTaken;
        this.salary = salary;
        this.yearsWorked = yearsWorked;
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String username, String password)
    {
        return this.username.equals(username) && this.password.equals(password);
    }

    public int timeToRetirement()
    {
        return Math.min(60-age, 40-yearsWorked);
    }

    public int vacationTimeLeft()
    {
        return (daysWorked/360)*(30 - vacationDaysTaken);
    }

    public double calculateBonus()
    {
        return 2.2 * salary;
    }

    // public void printEmployeeDetails()
    // {
    //     System.out.println("Time to Retirement: " + timeToRetirement());
    //     System.out.println("Vacation Time Left: " + vacationTimeLeft());
    //     System.out.println("Bonus: " + calculateBonus());
    // }


}


