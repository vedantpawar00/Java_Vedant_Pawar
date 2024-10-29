public class SalesRep extends Employee
{
    double salesMade;

    // public double getSalesMade() 
    // {
    //     return salesMade;
    // }


    public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken, double salary, int yearsWorked, String username, String password, double salesMade)
    {
        super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, username, password);
        this.salesMade = salesMade;
    }

    public double calculateComission()
    {
        return 0.1 * salesMade;
    }

    public void profileVisit() 
    {
        // printEmployeeDetails();
        System.out.println("Opened profile of: " + firstName + lastName);
        System.out.println("Registration no.: " + registration);
        System.out.println("Age: " + age);
        System.out.println("Sales Made: " + salesMade);
        System.out.println("Total Commission Earned: " + calculateComission());
        
        System.out.println("Profile Closed");
    }


}
