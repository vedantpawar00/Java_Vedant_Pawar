abstract class Animal 
{
    abstract void sound();   
}

class Donkey
{
    void run()
    {
        System.out.println("running");
    }
}
 
public class Anonymous
{
    public static void main(String[] args) 
    {
        Animal cat= new Animal()   // making abstract class as Anonymous class
        {   
            void sound()
            {
                System.out.println("Meow");
            }
        };
        cat.sound();

        Donkey d = new Donkey()    // making normal class as Anonymous class
        {
            void run()
            {
                System.out.println("in anonymous");
            }
        };
        d.run();
    }
}


