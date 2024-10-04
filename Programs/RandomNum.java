import java.util.Random;

public class RandomNum 
{
    public static void main(String[] args) 
    {
        Random random = new Random();

        int randomNumber = random.nextInt(); 
        System.out.println("Random Integer: " + randomNumber);

        int boundedRandomNumber = random.nextInt(100);
        System.out.println("Random Integer between 0 and 100: " + boundedRandomNumber);
    }
}
