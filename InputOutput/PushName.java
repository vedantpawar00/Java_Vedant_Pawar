import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PushName 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner sc = new Scanner(System.in);
        String fn = sc.next();
        String ln = sc.next();

        FileWriter fw = new FileWriter("output.txt");
        fw.append(fn + " " + ln);

        System.out.println("Pushed");
        
        // String outputText = "Hi";
        // fw.write(outputText);

        fw.close();
        sc.close();
    }
}
