public class SalesRep extends Employee
{
    double salesMade;

    // public double getSalesMade() 
    // {
    //     return salesMade;
    // }


    public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken, double salary, int yearsWorked, double salesMade)
    {
        super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
        this.salesMade = salesMade;
    }

    public double calculateComission()
    {
        return 0.1 * salesMade;
    }

    public void printSalesRepDetails() 
    {
        // printEmployeeDetails();
        System.out.println("Sales Made: " + salesMade);
        System.out.println("Commission: " + calculateComission());
    }


}
