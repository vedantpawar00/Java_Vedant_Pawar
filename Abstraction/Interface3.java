interface Bank2
{  
    float rateOfInterest();  
}  

class SBI2 implements Bank2
{  
    public float rateOfInterest()
    {
        return 9.15f;
    }  
}

class PNB2 implements Bank2
{  
    public float rateOfInterest()
    {
        return 9.7f;
    }  
}  

public class Interface3 
{
	public static void main(String[] args)
    {  
    	Bank2 b = new SBI2();  
    	System.out.println("ROI: " + b.rateOfInterest());  
    }        
}
