import java.util.Arrays;
import java.util.Scanner;

public class Array_String 
{
    String[] topics;
  
    public Array_String(String[] initialTopics)
    {
        topics = initialTopics;
    }

    public static void main(String[] args) 
    {
        Array_String feed;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter: ");
        String input = sc.nextLine(); 

        if(input.equals("Robot"))
        {
            String[] robotTopics = {"Oil", "Parts", "Algorithms", "Love"};
            feed = new Array_String(robotTopics);
        }
        else if(input.equals("Human"))
        {
            String[] humanTopics = {"Politics", "Science", "Sports", "Love"};
            feed = new Array_String(humanTopics);
        }
        else
        {
            String[] genericTopics = {"Opinion", "Tech", "Science", "Health"};
            feed = new Array_String(genericTopics);
        }
            
        System.out.println("The topics in this feed are:");
        System.out.println(Arrays.toString(feed.topics));

        sc.close();
    }    
}
