// Interface inheritance
// A class implements an interface, but one interface extends another interface


interface Printable3
{  
    void print();  
}  

interface Showable3 extends Printable3
{  
    void show();  
}  
    
public class Interface5 implements Showable3
{
    public void print()
    {
        System.out.println("Hello");
    }  
	public void show()
    {
        System.out.println("Welcome");
    }  
	  
	public static void main(String args[])
    {  
        Interface5 obj = new Interface5();  
        obj.print();  
        obj.show();  
	}  
}
