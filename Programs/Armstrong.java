public class Armstrong 
{
    public static void main(String[] args) 
    {
        int num = 153;
        int rem, sum=0, count=0;
        
        int temp = num;
        count = String.valueOf(num).length();
        // while (temp > 0) 
        // {
        //     temp /= 10;
        //     count++;
        // }

        temp = num;

        while (num > 0 ) 
        {
            rem = num % 10;
            sum += Math.pow(rem, count);
            num /= 10;
        }

        if(sum == temp)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not");
        }

    }    
}
