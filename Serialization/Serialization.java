import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.ObjectInputStream;

class StudentSer implements Serializable
{
    String name;
    int id;
    public StudentSer(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
}

public class Serialization 
{
    public static void main(String[] args) 
    {
        StudentSer s1 = new StudentSer("abc", 111);
        StudentSer s2 = new StudentSer("pqr", 222);
        StudentSer s3 = new StudentSer("xyz", 333);
            
        try 
        {
            FileOutputStream fout = new FileOutputStream("file.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            
            out.writeObject(s1);
            out.writeObject(s2);
            out.writeObject(s3);

            out.flush();
            out.close();
            
            System.out.println("success");
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }

        try 
        {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.txt"));
            
            for(int i=0; i<3; i++)
            {
                StudentSer temp = (StudentSer)ois.readObject();
                System.out.println("ID: " + temp.id + " Name: " + temp.name);
            }
            
            ois.close();
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }

    }
}
