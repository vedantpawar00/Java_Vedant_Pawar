import java.util.*;

public class App 
{
    public static void main(String[] args) throws Exception {

        LinkedList<String> al=new LinkedList<String>();  
        al.add("Ravi");  
        al.add("Vijay");  
        al.add("Ravi");  
        al.add("Ajay");  
        Iterator<String> itr=al.iterator();  
        while(itr.hasNext()){  
        System.out.println(itr.next());  
        }  

    }
}
