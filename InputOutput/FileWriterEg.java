import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEg 
{
    public static void main(String[] args) throws IOException 
    {
        FileWriter writer = new FileWriter("output1.txt");
        String outputText = "Hi";
        writer.write(outputText);

        writer.close();
    }
}
