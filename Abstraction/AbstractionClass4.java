// Another real scenario of abstract class
// The abstract class can also be used to provide some implementation of the interface. In such case, the end user may not be forced to override all the methods of the interface.

interface A 
{
    void a();
    void b();
}

abstract class B implements A
{
    public void b()
    {
        System.out.println("B");
    }
}

class M extends B 
{
    public void a()
    {
        System.out.println("A");
    }
}


public class AbstractionClass4 
{
    public static void main(String[] args) 
    {
        A a = new M();
        a.a();
        a.b();
    }
}
