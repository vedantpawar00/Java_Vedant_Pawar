// For loops
// Use the for loop to create a programm that ask the user to input a name and then prints each of the letters of the name
// Hint You can use the following String functions:
// lenght() -> returns the total number of characters of a given String
// chartAt(i) -> returns the character at the given position(i) of a String


import java.util.Scanner;

public class Letters 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String s = sc.nextLine();

        for(int i=0; i<s.length(); i++)
        {
            System.out.println(s.charAt(i));
        }

        // System.out.println(s);

        sc.close();
    }
}
