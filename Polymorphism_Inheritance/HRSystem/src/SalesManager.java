public class SalesManager extends SalesRep
{
    double salesTeam;

    public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken, double salary, int yearsWorked, String username, String password, double salesMade, double salesTeam) 
    {
        super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, username, password, salesMade);
        this.salesTeam = salesTeam;
    }
    
    // public double getSalesTeam() 
    // {
    //     return salesTeam;
    // }

    // public void addToSalesTeam(double newSales)
    // {
    //     this.salesTeam += newSales;
    // }

    @Override
    public void profileVisit()
    {
        super.profileVisit();
    }

    public void calculateTeamComission()
    {
        // return 0.03 * salesTeam;
        System.out.println("Total commision by manager: " + (0.03 * (salesTeam + salesMade)));
    }

    // public void printSalesManagerDetails()
    // {
    //     // printEmployeeDetails();
    //     System.out.println("Sales made by team: " + salesTeam);
    //     System.out.println("Manager Comission: " + calculateTeamComission());
    // }
    
    

}
