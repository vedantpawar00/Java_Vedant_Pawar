public class Array_Length 
{
    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    int[] views = {0, 0, 0, 0};
    
    public int getNumTopics()
    {
        return topics.length; 
    }

    public static void main(String[] args) 
    {
        Array_Length sampleFeed = new Array_Length();
        System.out.println("The number of topics is "+ sampleFeed.getNumTopics());
    }    
}
