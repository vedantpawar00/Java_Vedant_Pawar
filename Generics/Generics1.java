// import java.util.ArrayList;
// import java.util.List;

class Gen<T>
{
    T obj;
    void add(T obj)
    {
        this.obj = obj;
    }
    T get()
    {
        return obj;
    }
}

public class Generics1 
{
    public static void main(String[] args)   
    {
        // ArrayList li = new ArrayList<>();
        Gen <String> stringGen = new Gen<String>();
        stringGen.add("abc");
        System.out.println("Value in string obj is " + stringGen.get());

        Gen<Integer> intGen = new Gen<Integer>();
        intGen.add(111);
        System.out.println("Value in int obj is " + intGen.get());

        printGen(10);
        printGen("xyz");
        printGen(10.44);
        printGen(stringGen);
    } 

    public static <E> void printGen(E dataE)
    {
        System.out.println("Data received is " + dataE);
    }
}
