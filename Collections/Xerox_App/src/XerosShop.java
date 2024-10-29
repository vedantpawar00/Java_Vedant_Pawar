import java.util.Scanner;

public class XerosShop 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter document: ");
        String docName = sc.nextLine();
        System.out.println("Enter number of pages to print: ");
        int numPages = sc.nextInt();
        


        sc.close();
    }
}
