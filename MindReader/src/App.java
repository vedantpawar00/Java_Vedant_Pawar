import java.util.Scanner;
import java.util.*;

class Player_A
{
    int p_scr=0;
    int p_input;
    String name;
    public Player_A(String namepassed)
    {
        this.name = namepassed;
    }
    public void printPlayerDetails()
    {
        System.out.println("Name of player: "+ name);
        System.out.println("Player Score: " + p_scr);
    }
}

class Computer
{
    int c_scr=0;
    int c_pred;
    String name = "Robo";
    public int Prediction()
    {
        Random r = new Random();
        return r.nextInt(2);
    }
    public void printPlayerDetails()
    {
        System.out.println("Name of player: "+ name);
        System.out.println("Computer Score: " + c_scr);
    }
}

public class App 
{
    public static void main(String[] args) 
    {
        Player_A P = new Player_A("Bahubali");
        Computer C = new Computer();

        // int p_scr=0, c_scr=0;
        // int c_pred = 1;
        // int p_input;

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        for(;;)
        {
            System.out.print("Enter input: ");
            P.p_input = sc.nextInt();
            System.out.println("You entered: " + P.p_input);
            C.c_pred = C.Prediction();
            System.out.println("Prediction: " + C.c_pred);

            if(P.p_input == C.c_pred)
            {
                C.c_scr++;
                System.out.println("Current Score ====>");
                P.printPlayerDetails();
                C.printPlayerDetails();
            }
            else
            {
                P.p_scr++;
                System.out.println("Current Score ====>");
                P.printPlayerDetails();
                C.printPlayerDetails();
            }

            System.out.println("Computer score: " + C.c_scr);
            System.out.println("Player score: " + P.p_scr);
            System.out.println("***************************");

            if(C.c_scr == 4)
            {
                System.out.println("Computer won " + C.name);
                break;
            }
            else if(P.p_scr == 4)
            {
                System.out.println("Player won " + P.name);
                break;
            }
        }
        sc.close();
    }
}


