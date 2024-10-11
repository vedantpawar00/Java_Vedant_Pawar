// A movie cinema does price discounting depending on a customer's age.
// The app prompts a user to enter their age on the IntelliJ console after which it checks whether the user meets the discount conditions.
// Age range	Ticket Price
// Normal ticket	7 Euros
// Below 5	60% Discount
// Over 60	55% Discount
// Write the app so that the conditions above are met and the correct ticket price is returned.

import java.util.Scanner;

public class MovieDiscount 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        float discount = 0;
        float tprice = 7;

        if(age <= 5)
        {
            discount = 60;
            tprice = Cal_Dis(tprice, discount);
            // System.out.println("Discount price: " + );
            System.out.println("Ticket price: " + tprice);
        }
        else if(age >= 60)
        {
            discount = 55;
            tprice = Cal_Dis(tprice, discount);
            System.out.println("Ticket price: " + tprice);
        }
        else
        {
            System.out.println("Ticket price: " + tprice);
        }

        sc.close();
    }

    public static float Cal_Dis(float tprice, float discount)
    {
        return tprice - (tprice*discount)/100;
    }

}
