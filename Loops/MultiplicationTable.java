// While loops
// Open your IDE and create a new Java class named Table
// Copy the following code into your Java class Table and verify it works
// 	import java.util.Scanner;
// 	public class Table
// 	{
// 	    public static void main(String[] args)
// 	    {
// 	        Scanner console = new Scanner(System.in);
// 	        int num;
// 	        System.out.print("Enter any positive integer: ");
// 	        num = console.nextInt();
// 	        System.out.println("Multiplication Table of " + num);	 
// 	    }
// 	}
// Implement a while loop that prints out the multiplication table of the given input number.



import java.util.Scanner;

public class MultiplicationTable 
{
    public static void main(String[] args) 
    {
        Scanner console = new Scanner(System.in);
        int multiplicand, multiplier=1, product=0;
        
        System.out.print("Enter any positive integer as multiplicand: ");
        multiplicand = console.nextInt();
                
        System.out.println("Multiplication Table of " + multiplicand);

        // while (multiplier <= 10) 
        // {
        //     product = multiplicand * multiplier;
        //     System.out.println(multiplicand + " x " + multiplier + " = " + product);
        //     multiplier++;
        // }

        // int i=1;
        // while (i <= multiplicand) 
        // {
        //     multiplier = i;
        //     while (multiplier <= 10) 
        //     {
        //         product = i * multiplier;
        //         System.out.println(i + " x " + multiplier + " = " + product);
        //         multiplier++;
        //     }
        //     i++;
        // }

        int i=1;
        while (i <= multiplicand) 
        {
            multiplier = 1;
            while (multiplier <= 10) 
            {
                product = i * multiplier;
                System.out.println(i + " x " + multiplier + " = " + product);
                multiplier++;
            }
            i++;
        }


        console.close();
    }
}
