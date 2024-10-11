public class EqualityOpe 
{
    public static void main(String[] args) 
    {
        
        System.out.println("int=========>");
        Integer int_obj1 = new Integer(2);
        Integer int_obj2 = new Integer(2);
        System.out.println("Integer: " + int_obj1);
        System.out.println("equals: " + int_obj1.equals(int_obj2));
        System.out.println("compareTo: " + int_obj1.compareTo(int_obj2));
        System.out.println("hashCode: " + int_obj1.hashCode());
        System.out.println("toString: " + int_obj1.toString());
        System.out.println("valueOf: " + Integer.valueOf(int_obj1));
        System.out.println("compare: " + Integer.compare(int_obj1, int_obj2));
        System.out.println("parse: " + Integer.parseInt("100"));

        // System.out.println("doubleValue: " + int_obj1.doubleValue());
        // System.out.println("floatValue: " + int_obj2.floatValue());

        System.out.println("float=========>");
        Float f_obj1 = new Float(2.2);
        Float f_obj2 = new Float(3.3);
        System.out.println("Float: " + f_obj1);
        System.out.println("equals: " + f_obj1.equals(f_obj2));
        System.out.println("compareTo: " + f_obj1.compareTo(f_obj2));
        System.out.println("hashCode: " + f_obj1.hashCode());
        System.out.println("toString: " + f_obj1.toString());
        System.out.println("valueOf: " + Float.valueOf(f_obj1));
        System.out.println("compare: " + Float.compare(f_obj1, f_obj2));
        System.out.println("parse: " + Float.parseFloat("202.12"));


        System.out.println("char=========>");
        Character c_obj1 = new Character('A');
        Character c_obj2 = new Character('A');
        System.out.println("Character: " + c_obj1);
        System.out.println("equals: " + c_obj1.equals(c_obj2));
        System.out.println("compareTo: " + c_obj1.compareTo(c_obj2));
        System.out.println("hashCode: " + c_obj1.hashCode());
        System.out.println("toString: " + c_obj1.toString());
        System.out.println("valueOf: " + Character.valueOf(c_obj1));
        System.out.println("compare: " + Character.compare(c_obj1, c_obj2));
        // System.out.println("parse: " + Character.parse);


        System.out.println("boolean=========>");
        Boolean b_obj1 = new Boolean(true);
        Boolean b_obj2 = new Boolean(false);
        System.out.println("Boolean: " + b_obj1 + b_obj2);
        System.out.println("equals: " + b_obj1.equals(b_obj2));
        System.out.println("compareTo: " + b_obj1.compareTo(b_obj2));
        System.out.println("hashCode: " + b_obj1.hashCode() + " " + b_obj2.hashCode());
        System.out.println("toString: " + b_obj1.toString());
        System.out.println("valueOf: " + Boolean.valueOf(b_obj1));
        System.out.println("compare: " + Boolean.compare(b_obj1, b_obj2));
        System.out.println("parse: " + Boolean.parseBoolean("false"));




    }
}
