import java.util.Scanner;

public class LinearSearch 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter num: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter elements: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Key: ");
        int key = sc.nextInt();

        boolean flag = false;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == key)
            {
                System.out.println("Element " + key + " found at index " + i);
                flag = true;
                break;
            }
        }
        if(!flag)
        {
            System.out.println("Not found");
        }

        sc.close();
    }
}







// // using method
// import java.util.Scanner;

// public class LinearSearch 
// {
//     public static int linear(int[] arr, int key)
//     {
//         for(int i=0; i<arr.length; i++)
//         {
//             if(arr[i] == key)
//             {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter num: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.print("Enter elements: ");
//         for(int i=0; i<n; i++)
//         {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Key: ");
//         int key = sc.nextInt();

//         int result = linear(arr, key);

//         if(result == -1)
//         {
//             System.out.println("Not found");
//         }
//         else
//         {
//             System.out.println("Element " + key + " found at index " + result);
//         }

//         sc.close();
//     }
// }
