import java.util.Scanner;

public class MindReader 
{
    public static void main(String[] args) 
    {
        int p_scr=0, c_scr=0;
        int c_pred = 1;
        int p_input;

        Scanner sc = new Scanner(System.in);

        for(;;)
        {
            System.out.print("Enter number: ");
            p_input = sc.nextInt();

            if(c_pred == p_input)
            {
                c_scr++;
            }
            else
            {
                p_scr++;
            }

            System.out.println("Com: " + c_scr);
            System.out.println("Player: " + p_scr);

            if(c_scr == 4)
            {
                System.out.println("Computer won");
                break;
            }
            else if(p_scr == 4)
            {
                System.out.println("Player won");
                break;
            }
            sc.close();
        }
    }
}
