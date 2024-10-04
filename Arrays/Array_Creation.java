import java.util.Arrays;

public class Array_Creation
{
    public String[] getTopics()
    {
        String[] topics = {"Opinion", "Tech", "Science", "Health"};
        return topics;
    }

    public static void main(String[] args) 
    {
        Array_Creation sampleFeed = new Array_Creation();
        String[] topics = sampleFeed.getTopics();
        System.out.println(Arrays.toString(topics));
    }
}