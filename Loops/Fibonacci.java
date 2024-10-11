// Do While loops
// Create a new Java class with a main method(so you can run your code) called Fibonacci
// The Fibonacci numbers are a traditional computer science problem: "each number is the sum of the two preceding ones, starting from 0 and 1."
// The beginning of the sequence is thus:
// 0 1 1 2 3 5 8 13 21 34 55 89 ...
// Add the following import to be able to capture user input n
//   import java.util.Scanner;
// Implement a Do While loop that calculates Fibonacci(n)
// n	Fibonacci(n)
// 0	0
// 1	1
// 2	1
// 3	2
// 4	3
// 5	5
// 6	8
// 7	13
// ...	...


import java.util.Scanner;

public class Fibonacci 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        int first=0, second=1, i=1;

        do 
        {
            System.out.print(first + ", ");
            int next = first + second;
            first = second;
            second = next;
            i++;
        } while (i <= num);

        sc.close();
    }
}
