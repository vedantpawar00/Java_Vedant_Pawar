// write a Java app that takes numerical input from a user
// The app should calculate commission based on this chart used by the retail store.
// Sales Range	Commission
// above 10000$	30%
// 5001 - 9999$	20%
// 1001 - 4999$	10%
// below 1000$	N/A
// Example: if a user enters 7677 as their sales figure, it should calculate commission at 20%

import java.util.Scanner;

public class Commision 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int sales_amount = sc.nextInt();
        int commission_per = 0;
        float com;

        if(sales_amount <= 1000)
        {
            System.out.println("Sales amount is below range");
        }
        else if(sales_amount >= 1001 && sales_amount <= 4999)
        {
            commission_per = 10;
            com = Cal_Com(commission_per, sales_amount);
            System.out.println("Commission is calculated at 10%");
            System.out.println("Commission amount: " + com);
        }
        else if(sales_amount >= 5000 && sales_amount <= 9999)
        {
            commission_per = 20;
            com = Cal_Com(commission_per, sales_amount);
            System.out.println("Commission is calculated at 20%");
            System.out.println("Commission amount: " + com);
        }
        else if(sales_amount >= 10000)
        {
            commission_per = 30;
            com = Cal_Com(commission_per, sales_amount);
            System.out.println("Commission is calculated at 30%");
            System.out.println("Commission amount: " + com);
        }

        sc.close();
    }
    
    public static float Cal_Com(int sales_amount, int commission_per)
    {
        return (sales_amount*commission_per)/100;
    }

}
