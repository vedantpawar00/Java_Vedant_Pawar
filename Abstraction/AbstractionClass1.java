// In this example, Shape is the abstract class, and its implementation is provided by the Rectangle and Circle classes.
// if you create the instance of Rectangle class, draw() method of Rectangle class will be invoked.


abstract class Shape
{
    abstract void draw();
}

class Rectangle extends Shape
{
    void draw()
    {
        System.out.println("drawing rectangle");
    }
}

class Circle extends Shape
{
    void draw()
    {
        System.out.println("drawing circle");
    }
}

public class AbstractionClass1 
{
    public static void main(String[] args) 
    {
        Shape s1 = new Circle();
        s1.draw();
        Shape s2 = new Rectangle();
        s2.draw();
    }
}
