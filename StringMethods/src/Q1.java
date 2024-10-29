// Java Program to count the total number of characters in a string

public class Q1 
{
    public static void main(String[] args) 
    {
        String str = "Hello World";
        int count = 0;

        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) != ' ')
            {
                count++;
            }
        }

        System.out.println("Number of characters: " + count);
        
    }
}
