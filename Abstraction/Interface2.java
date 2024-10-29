// Java Interface Example: Drawable
// In this example, the Drawable interface has only one method. Its implementation is provided by Rectangle and Circle classes. 
// In a real scenario, an interface is defined by someone else, but its implementation is provided by different implementation providers. 
// Moreover, it is used by someone else. The implementation part is hidden by the user who uses the interface.


//Interface declaration: by first user  
interface Drawable
{  
    void draw();  
}  

//Implementation: by second user  
class Rectangle3 implements Drawable
{  
    public void draw()
    {
        System.out.println("drawing rectangle");
    }  
}  

class Circle3 implements Drawable
{  
    public void draw()
    {
        System.out.println("drawing circle");
    }  
}  

public class Interface2 
{
    public static void main(String args[])
    {  
        Drawable d = new Circle3();  
        d.draw();  
    }
        
}
