// Java 8 Static Method in Interface
// Since Java 8, we can have static method in interface. Let's see an example:


interface Drawable5
{  
    void draw();  
    static int cube(int x)
    {
        return x*x*x;
    }  
}  
    
class Rectangle5 implements Drawable5
{  
    public void draw()
    {
        System.out.println("drawing rectangle");
    }  
}  
    
public class Interface7 
{
    public static void main(String[] args) 
    {
        Drawable5 d = new Rectangle5();
        d.draw();    
        System.out.println(Drawable5.cube(3));
    }
    
}
