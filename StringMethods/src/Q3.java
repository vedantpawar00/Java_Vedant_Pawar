// Java Program to count the total number of vowels and consonants in a string

public class Q3 
{
    public static void main(String[] args) 
    {
        String str = "Hello World";
        int vcount = 0, ccount = 0;

        str = str.toLowerCase();

        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
            {
                vcount++;
            }
            else if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
                ccount++;
            }
        }

        System.out.println("Number of Vowels: " + vcount);
        System.out.println("Number of Consonants: " + ccount);
        
    }
}
