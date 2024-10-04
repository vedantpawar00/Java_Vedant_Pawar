public class Fibonacci
{
    public static void main(String[] args) 
    {
        int n1=0, n2=1;   
        fibo(n1, n2);

        // //When method (fibo()) is not-static, it cannot be directly accessed from a static (main()).
        // //Create an instance of Fibonacci class
        // Fibonacci fibo2 = new Fibonacci();
        // //Call the non-static fibo method using the object
        // fibo2.fibo(n1, n2);
    }

    public static void fibo(int n1, int n2)
    {
        int[] a = new int[10];
        a[0]=0;
        a[1]=1;
        for(int i=2; i<a.length; i++)
        {
            int n3 = n1+n2;
            a[i] = n3;
            n1 = n2;
            n2 = n3;
        }
        for(int i=0; i<a.length; i++)
        {
            System.out.println("A[" + i + "]=>" + a[i]);
        }
    }

}