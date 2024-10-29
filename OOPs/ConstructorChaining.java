public class ConstructorChaining 
{
    ConstructorChaining()
    {
        System.out.println("default");
    }

    ConstructorChaining(String name)
    {
        this();
        System.out.println("parameterized" + name);
    }

    public static void main(String[] args) 
    {
        // ConstructorChaining c = new ConstructorChaining();    
        ConstructorChaining c2 = new ConstructorChaining("vedant");  
        System.out.println(c2);  
    }
}
