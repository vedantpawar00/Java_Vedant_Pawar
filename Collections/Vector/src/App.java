import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Vector<String> v=new Vector<String>();  
        v.add("Ayush");  
        v.add("Amit");  
        v.add("Ashish");  
        v.add("Garima");  
        Iterator<String> itr=v.iterator();  
        while(itr.hasNext()){  
        System.out.println(itr.next());  
        }  

    }
}
