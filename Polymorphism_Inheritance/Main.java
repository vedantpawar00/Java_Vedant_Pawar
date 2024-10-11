// Part 1: Exploring the HR System
// Download the src folder and import the project into IntelliJ Idea
// In this exercise, we'll create the Human Resources Management System mentioned in the theory section
// Create the following class
// Implement the methods:
//    public int timeToRetirement(){
//       // time to retirement = min(60 - age, 40 - yearsWorked)
//    }
//    public int vacationTimeLeft(){
//        // vacation time left = (daysWorked/360)*(30 - vacationDaysTaken)
//    }
//    public int calculateBonus(){
//        // bonus = 2.2*salary
//    }
// Now, create a sales rep class that inherits the original employee class
// The arrow used means inheritance in class diagrams
//    public int calculateComission(){
//       // comission = 0.1 * salesMade
//    }
// Create a Java Class for sales manager:
//    public void calculateComission(){
//       // 0.03 * all sales made by team
//    }
// Run the main method and verify that your implementation works.




public class Main 
{
    public static void main(String[] args) 
    {
        Employee emp = new Employee("Vedant", "Pawar", 101, 22, 3200, 10, 50000, 20);
        emp.printEmployeeDetails();
        System.out.println();

        SalesRep sr = new SalesRep("Rahul", "Sharma", 102, 21, 730, 5, 20000, 2, 20000);
        sr.printSalesRepDetails();
        System.out.println();

        SalesManager sm1 = new SalesManager("Pankaj", "Mali", 103, 20, 730, 5, 30000, 2, 10000, 20000);
        SalesManager sm2 = new SalesManager("a", "b", 104, 20, 720, 6, 35000, 2, 12000, 25000);
        SalesManager sm3 = new SalesManager("c", "d", 105, 20, 710, 7, 38000, 2, 15000, 30000);
        
        sm1.addToSalesTeam(5000);
        sm1.addToSalesTeam(8000);

        sm1.printSalesManagerDetails();
        sm2.printSalesManagerDetails();
        sm3.printSalesManagerDetails();

    }
}
