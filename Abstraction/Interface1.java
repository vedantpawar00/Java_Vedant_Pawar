// Java Interface Example
// In this example, the Printable interface has only one method, and its implementation is provided in the A6 class.


interface printable
{   
    void print();
}

public class Interface1 implements printable
{
    public void print()
    {
        System.out.println("Hi");
    }
    public static void main(String[] args) 
    {
        Interface1 obj = new Interface1();
        obj.print();    
    }
}
