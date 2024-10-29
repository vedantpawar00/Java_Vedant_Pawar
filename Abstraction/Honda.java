// Abstract class that has an abstract method
// In this example, Bike is an abstract class that contains only one abstract method run. Its implementation is provided by the Honda class.


abstract class Bike 
{
    abstract void run();

    protected abstract void changeGear();
}

class Honda extends Bike
{
    void run()
    {
        System.out.println("running");
    }

    public static void main(String[] args) 
    {
        Bike b = new Honda();
        
        b.run();   
    
    }

    @Override
    protected void changeGear() {
        throw new UnsupportedOperationException("Unimplemented method 'changeGear'");
    }
}
