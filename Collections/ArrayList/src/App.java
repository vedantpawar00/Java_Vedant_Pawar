// import java.util.ArrayList;
import java.util.*;

public class App 
{
    public static void main(String[] args) throws Exception 
    {

        ArrayList<String> list = new ArrayList<String>();//Creating arraylist  
        
        list.add("Ravi");   //Adding object in arraylist   
        System.out.println("Added in the list (add): "); 
        printList(list);
        list.add("Vijay");      
        System.out.println("Added in the list (add): "); 
        printList(list);
        list.add("Ravi");      
        System.out.println("Added in the list (add): "); 
        printList(list);
        list.add("Ajay");      
        System.out.println("Added in the list (add): "); 
        printList(list);

        boolean added = list.add("Kishan");
        System.out.println("Added in the list (boolean add): " + added); 
        printList(list);

        String e1 = list.get(1);
        System.out.println("Element at index (get): " + e1);

        String e2 = list.set(1, "Mohan");
        System.out.println("Updated Element at index (set): " + e2);

        System.out.println("Updated List (set) : ");
        printList(list);

        list.remove(4);
        System.out.println("Updated List (remove): ");
        printList(list);
        
        list.clear();
        System.out.println("Updated List (clear): ");
        printList(list);
        
    }

    public static void printList(ArrayList a)
    {
        //Traversing list through Iterator  
        Iterator itr = a.iterator();  
        while(itr.hasNext())
        {  
            System.out.println(itr.next());  
        }
    }

}
