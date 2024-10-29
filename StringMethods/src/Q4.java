// Java Program to determine whether two strings are the anagram

import java.util.Arrays;

public class Q4 
{
    public static void main(String[] args) 
    {
        String str1 = "Brag";
        String str2 = "Grab";
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() != str2.length())
        {
            System.out.println("Not Anagram");
        }

        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);

        if(Arrays.equals(s1, s2) == true)
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anagram");
        }
        
    }
}
