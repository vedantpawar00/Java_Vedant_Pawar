// Create a new Java class that will have the following functionality:
// Name should be CalculatorBrain
// Implement a function for each aritmetic operation
// Addition
// Subtraction
// Multiplication
// Division
// Add some code to the main method to invoke the aritmetic functions defined and verify it works as expected.
// Add some more functionality to your CalculatorBrain:
// Square Root
// Power Of

import java.util.Scanner;

public class CalculatorBrain 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num 2: ");
        int num2 = sc.nextInt();

        addition(num1, num2);
        subtraction(num1, num2);
        multiplication(num1, num2);
        division(num1, num2);
        squareRoot(num1);
        powerOf(num1, num2);

        sc.close();
    }

    public static int addition(int num1, int num2)
    {
        int op = num1 + num2;
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + op);
        return op;
    }
    
    public static int subtraction(int num1, int num2)
    {
        int op = num1 - num2;
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + op);
        return op;
    }
    
    public static int multiplication(int num1, int num2)
    {
        int op = num1 * num2;
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + op);
        return op;
    }
    
    public static int division(int num1, int num2)
    {
        int op = num1 / num2;
        System.out.println("Division: " + num1 + " / " + num2 + " = " + op);
        return op;
    }
    
    public static int squareRoot(int num1)
    {
        int op = (int)Math.sqrt(num1);
        System.out.println("Square root: " + num1 + " = " + op);
        return op;
    }
    
    public static int powerOf(int num1, int num2)
    {
        int op = (int)Math.pow(num1, num2);
        System.out.println("Power of: " + num1 + " ^ " + num2 + " = " + op);
        return op;
    }

}
