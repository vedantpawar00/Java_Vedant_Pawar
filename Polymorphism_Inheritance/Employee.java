public class Employee 
{
    String firstName;
    String lastName;
    int registration;
    int age;
    int daysWorked;
    int vacationDaysTaken;
    double salary;
    int yearsWorked;

    public Employee(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken, double salary, int yearsWorked) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.age = age;
        this.daysWorked = daysWorked;
        this.vacationDaysTaken = vacationDaysTaken;
        this.salary = salary;
        this.yearsWorked = yearsWorked;
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

    public void printEmployeeDetails()
    {
        System.out.println("Time to Retirement: " + timeToRetirement());
        System.out.println("Vacation Time Left: " + vacationTimeLeft());
        System.out.println("Bonus: " + calculateBonus());
    }


}


