public class Exceptions 
{
    @SuppressWarnings("null")
    public static void main(String[] args) 
    {
        // 1. ArithmeticException
        int a = 50;
        try 
        {
            System.out.println(a/0);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Can't divide by 0" + e);
        }
        

        // 2. NullPointerException
        String s = null;
        try 
        {
            System.out.println(s.length());
        } 
        catch (NullPointerException e) 
        {
            System.out.println("null value" + e);
        }


        // 3. NumberFormatException
        String s2 = "abc";
        try 
        {
            int i = Integer.parseInt(s2);
            System.out.println(i);
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("invalid format for conversion" + e);
        }


        // 4. ArrayIndexOutOfBoundsException
        int a2[] = new int[5];
        try 
        {
            a2[10] = 50;
            System.out.println(a2[10]);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("array index out of bounds" + e);
        }

    }
}
