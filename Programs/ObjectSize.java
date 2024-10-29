public class ObjectSize 
{
    int i;
    float f;

    ObjectSize(int i, float f)
    {
        this.i = i;
        this.f = f;
    }

    public static void main(String[] args) 
    {
        ObjectSize obj = new ObjectSize(2, 3.2f);

        System.out.println(obj.i);
        System.out.println(obj.f);
    }
}
