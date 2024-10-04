public class Fibonacci_Series 
{
    long arr[] = new long[20];
    
    public Fibonacci_Series()
    {
        generateSeries();
    }

    public void generateSeries()
    {
        long first=0, second=1;
        int index=0;
        // while (index < arr.length) 
        // {
        //     long next = first + second;
        //     if(next % 2 == 0)
        //     {
        //         arr[index] = next;
        //         index++;
        //     }    
        //     first = second;
        //     second = next;
        // }

        for(index=0; index<arr.length;)
        {
            long next = first + second;
            if(next % 2 == 0)
            {
                arr[index] = next;
                index++;
            }    
            first = second;
            second = next;
        }
    }

    public long sum()
    {
        long sum=0;
        for(int i=0; i<arr.length; i++)
        {
            sum += arr[i];
        }
        return sum;
    }

    public void printArray()
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.println("A[" + i + "] => " + arr[i]);
        }
    }

    public static void main(String[] args) 
    {
        Fibonacci_Series fs = new Fibonacci_Series();
        System.out.println("Fibonacci Series: ");
        fs.printArray();

        System.out.println("Sum: " + fs.sum());
    }
}
