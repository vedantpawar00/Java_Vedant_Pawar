// Download the project and import it into IntelliJ Idea
// Implement the following functions:
//     private static void printNameLength( String name )
//     {
//     }
//     private static void printNameCharacters( String name )
//     {
//     }
// Test your code with 5 different names and verify that the behaviour is correct.
// Modify your code to also capture from the user the last name.
// Implement an additional function that prints the FUll name of the person.

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner console = new Scanner( System.in );
        System.out.println( "Enter your name:  " );
        String name = console.next();
        System.out.println( "Enter last name:  " );
        String name2 = console.next();

        printNameLength(name);
        printNameCharacters(name);
        printFullName(name, name2);

        console.close();
    }

    private static void printNameLength(String name)
    {
        System.out.println("Length: " + name.length());
    }

    private static void printNameCharacters(String name)
    {
        System.out.println("Characters: ");
        for(int i=0; i<name.length(); i++)
        {
            System.out.println(name.charAt(i));
        }
    }
    
    private static void printFullName(String name, String name2)
    {
        System.out.println("Full Name: " + name + " " + name2);
    }

}
