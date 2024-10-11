public class SalesManager extends SalesRep
{
    double salesTeam;

    public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken, double salary, int yearsWorked, double salesMade, double salesTeam) 
    {
        super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, salesMade);
        this.salesTeam = salesTeam;
    }
    
    public double getSalesTeam() 
    {
        return salesTeam;
    }

    public void addToSalesTeam(double newSales)
    {
        this.salesTeam += newSales;
    }


    public double calculateTeamComission()
    {
        return 0.03 * salesTeam;
    }

    public void printSalesManagerDetails()
    {
        // printEmployeeDetails();
        System.out.println("Sales made by team: " + salesTeam);
        System.out.println("Manager Comission: " + calculateTeamComission());
    }
    

}
