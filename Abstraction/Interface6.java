// Java 8 Default Method in Interface
// Since Java 8, we can have method body in interface. But we need to make it default method. Let's see an example:


interface Drawable4
{  
    void draw();  
    default void msg()
    {
        System.out.println("default method");
    }  
}  
class Rectangle4 implements Drawable4
{  
    public void draw()
    {
        System.out.println("drawing rectangle");
    }  
}  

public class Interface6 
{
    public static void main(String[] args) 
    {
        Drawable4 d=new Rectangle4();  
        d.draw();  
        d.msg();  
    }
}
