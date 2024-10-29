abstract class Bank
{
    abstract int getRateofInterest();
}

class SBI extends Bank
{
    int getRateofInterest()
    {
        return 10;
    }
}

class PNB extends Bank
{
    int getRateofInterest()
    {
        return 8;
    }
}

public class AbstractionClass2 
{
    public static void main(String[] args) 
    {
        Bank b;
        b = new SBI();
        System.out.println("Rate of Interest: " + b.getRateofInterest() + " %");
        b = new PNB();
        System.out.println("Rate of Interest: " + b.getRateofInterest() + " %");
       
    }
}
