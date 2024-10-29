public class Prac 
{
    public static void main(String[] args) {
        
        String s = "Hello";
        // char ch =  s.charAt(1);
        System.out.println("ssdfd " + s.charAt(2));
        
        s.concat("world");
        System.out.println("orginal " + s);
        
        String ns = s.concat("world");
        System.out.println("new " + ns);

        System.out.println();

        String s1 = "hello";
        s1 = "java";
        System.out.println("s1: " + s1);
        //You are not modifying the string itself but rather reassigning the reference.
        //When you reassign s1, you are not changing the original "hello" string but,
        //rather creating a new string "java" and updating the reference of s1 to point to the new string.

        String ns1 = s1.concat(s1);
        System.out.println("ns1: " + ns1);


        String s2 = "hello";
        s2.concat("world");                 
        System.out.println("s2: " + s2);
        //s2 not getting upgraded because String is immutable, Updating with concat() operation

        String ns2 = s2.concat("java");     
        System.out.println("ns2: " + ns2);
        //we created new instance(s21) for s2 then value gets concatenated, 
        //concatenated String will be created as a new instance and an object should refer to that instance to get concatenated value.


    }
}
