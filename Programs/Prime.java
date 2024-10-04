// import java.util.Scanner;

// public class Prime 
// {
//     public static void main(String[] args) 
//     {
//         int num_check, flag=0;
        
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter: ");
//         num_check = sc.nextInt();

//         if(num_check==0 || num_check==1)
//         {
//             System.out.println("not prime");
//         }
//         else
//         {
//             for(int i=2; i<=num_check/2; i++)
//             {
//                 if(num_check%i == 0)
//                 {
//                     System.out.println("not prime");
//                     flag = 1;
//                     break;
//                 }
//             }
//             if(flag == 0)
//             {
//                 System.out.println("prime");
//             }
//         }
//         sc.close();
//     }
// }



// Using Method 
import java.util.Scanner;

public class Prime 
{
    public static void prime()
    {
        int flag=0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        int num_check = sc.nextInt();

        if(num_check==0 || num_check==1)
        {
            System.out.println("not prime");
        }
        else
        {
            for(int i=2; i<=num_check/2; i++)
            {
                if(num_check%i == 0)
                {
                    System.out.println("not prime");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
            {
                System.out.println("prime");
            }
        }
        sc.close();
    }
    
    public static void main(String[] args) 
    {
        prime();
    }

}



