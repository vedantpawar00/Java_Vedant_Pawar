public class BinarySearch 
{
    public static void binary(int[] arr, int beg, int end, int key)
    {
        int mid = (beg+end)/2;
        while(beg <= end)
        {
            if(arr[mid] < key)
            {
                beg = mid + 1;
            }
            else if(arr[mid] == key)
            {
                System.out.println("Element found at: " + mid);
                break;
            }
            else
            {
                end = mid - 1;
            }
            mid = (beg+end)/2;
        }
        if(beg > end)
        {
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) 
    {
        int[] arr = {2, 4, 6, 8, 10};
        int key = 6;
        int end = arr.length-1;
        binary(arr, 0, end, key);
    }
}



// // pre-defined method

// import java.util.Arrays;
// public class BinarySearch 
// {
//     public static void main(String[] args) 
//     {
//         int[] arr = {2, 4, 6, 8, 10};
//         int key = 6;
//         int result = Arrays.binarySearch(arr, key);  
//         if (result < 0)  
//         {
//             System.out.println("Element not found");  
//         }
//         else 
//         { 
//             System.out.println("Element found at index: " + result); 
//         }
//     }
// }


