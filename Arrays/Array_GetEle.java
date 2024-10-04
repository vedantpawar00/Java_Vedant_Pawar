public class Array_GetEle 
{
    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    public int[] views = {0, 0, 0, 0};

    public String[] getTopics()
    {
        return topics;
    }

    public String getFirstTopic()
    {
        return topics[0];
    }
    
    public void viewTopic(int topicIndex)
    {
        views[topicIndex]++;
    }

    public static void main(String[] args) 
    {
        Array_GetEle sampleFeed = new Array_GetEle();
        
        System.out.println("The top topic is " + sampleFeed.getFirstTopic());
            
        sampleFeed.viewTopic(1);
        sampleFeed.viewTopic(1);
        sampleFeed.viewTopic(3);
        sampleFeed.viewTopic(2);
        sampleFeed.viewTopic(2);
        sampleFeed.viewTopic(1);
            
        System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!");
    }    
}
