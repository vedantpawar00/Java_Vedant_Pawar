// class to both extend another class and implement an interface 

public class A3 
{
    public void methodA3()
    {
        System.out.println("Method from class A3");
    }
}


interface C3 
{
    void methodC3();
}


class B3 extends A3 implements C3
{
    public void methodC3()
    {
        System.out.println("Method from interface C3 implemented in B3");
    }

    public void methodB3()
    {
        System.out.println("Method for B3");
    }

    public static void main(String[] args) 
    {
        B3 b = new B3();
        b.methodA3();       // Inherited from class A
        b.methodB3();       // Specific to class B
        b.methodC3();       // Implemented from interface C
    }
}


