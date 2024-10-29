abstract class Vehicle2
{
   // This is a fully implemented method
    public void startEngine() 
    {
        System.out.println("Engine started");
    }
// This class does not have any abstract methods but is still abstract
}

class Car2 extends Vehicle2 
{
    // Inherits the startEngine() method
}

public class AbstractClass1 
{
    public static void main(String[] args) 
    {
       // Vehicle2 v = new Vehicle2();    // Error! Cannot instantiate an abstract class
        Car2 c = new Car2();    // Allowed because Car2 is a non-abstract class
        c.startEngine();        // Inherited method from Vehicle2
    }
}
