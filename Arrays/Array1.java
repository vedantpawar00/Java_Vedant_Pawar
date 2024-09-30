public class Array1
{
    public static void main(String[] args) 
    {
        int[] arr = new int[10];
        for(int i=0; i<arr.length; i++)
        {
            int y = i+20*300;
            System.out.print(y + " ");
        }
        System.out.println(arr);
        System.out.println("Array address: " + System.identityHashCode(arr));
    }
}
