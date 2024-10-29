// Abstract class having constructor, data member and methods
// An abstract class can have a data member, abstract method, method body (non-abstract method), constructor, and even main() method.


abstract class Bike2
{
    void Bike()
    {
        System.out.println("bike created");
    }
    abstract void run();
    void changeGear()
    {
        System.out.println("gear changed");
    }
}

class Honda2 extends Bike2
{
    void run()
    {
        System.out.println("running");
    }
}

public class AbstractionClass3 
{
    public static void main(String[] args) 
    {
        Bike2 obj = new Honda2();
        obj.run();
        obj.changeGear();    
    }
}
