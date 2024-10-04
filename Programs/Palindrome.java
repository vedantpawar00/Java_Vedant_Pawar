import java.util.Scanner;

public class Palindrome 
{
    public static void pal()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        int num = sc.nextInt();
        int rem, digit=0;
        int temp = num;

        while(num > 0)
        {
            rem = num % 10;
            digit = (digit*10) + rem;
            num /= 10;
        }

        if(temp == digit)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not");
        }
        sc.close();
    }

    public static void main(String[] args) 
    {
        pal();
    }
        
}

