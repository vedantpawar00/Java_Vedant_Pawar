// Java Program to Count the Total Number of Punctuation Characters Exists in a String

public class Q2 
{
    public static void main(String[] args) 
    {
        String str = "Hello, World!";
        int count = 0;

        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == ',' || str.charAt(i) == '!')
            {
                count++;
            }
        }

        System.out.println("Number of Punctuation characters: " + count);
        
    }
}
