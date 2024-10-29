// String Methods

public class App 
{
    public static void main(String[] args) throws Exception 
    {

    }
}





















// System.out.println("********** charAt() ***************");
// String sCh = "Hello";
// char ch = sCh.charAt(2);
// System.out.println("Character at given index: " + ch);
// System.out.println("Character at given index: " + sCh.charAt(1));


// System.out.println("********** compareTo() ***************");
// String sCom1 = "hello";
// String sCom2 = "hello";
// // String sCom2 = new String("hello");
// String sCom3 = "abc";
// String sCom4 = "pqr";
// System.out.println(sCom1.compareTo(sCom2));
// System.out.println(sCom1.compareTo(sCom3));
// System.out.println(sCom1.compareTo(sCom4));


// System.out.println("********** concat() ***************");
// String sConc = "hello";
// sConc =  sConc.concat(" world");
// System.out.println(sConc);


// sConc.concat(" world");
// String s2 = sConc.concat(" world");


// System.out.println("********** contains() ***************");
// String sCont = "Hello World";
// System.out.println(sCont.contains("World"));
// System.out.println(sCont.contains("Java"));


// System.out.println("********** endsWith() ***************");
// String sEnd = "Hello World";
// System.out.println(sEnd.endsWith("d"));
// System.out.println(sEnd.endsWith("a"));


// System.out.println("********** equals() ***************");
// String sEqu1 = "Hello";
// String sEqu2 = "Hello";
// String sEqu3 = "HELLO";
// System.out.println(sEqu1.equals(sEqu2));
// System.out.println(sEqu1.equals(sEqu3));


// System.out.println("********** equalsIgnoreCase() ***************");
// String sEquIgn1 = "Hello";
// String sEquIgn2 = "HELLO";
// String sEquIgn3 = "world";
// System.out.println(sEquIgn1.equalsIgnoreCase(sEquIgn2));
// System.out.println(sEquIgn1.equalsIgnoreCase(sEquIgn3));


// System.out.println("********** format() ***************");
// String sFor = "John";
// System.out.println(String.format("Name is %s", sFor));
// System.out.println(String.format("Age is %d", 22));


// System.out.println("********** getBytes() ***************");
// String sGetB = "ABCD";
// byte[] b = sGetB.getBytes();
// for(int i=0; i<b.length; i++)
// {  
//     System.out.println(b[i]);  
// }


// System.out.println("********** getChars() ***************");
// String sGetCh = "Hello World";
// char[] dst = new char[10];
// sGetCh.getChars(0, 8, dst, 0);
// System.out.println(dst);


// System.out.println("********** indexOf() ***************");
// String sIndex = "Hello World";
// System.out.println(sIndex.indexOf("o"));


// System.out.println("********** lastIndexOf() ***************");
// String sLastIn = "Hello World";
// System.out.println(sLastIn.lastIndexOf("o"));


// System.out.println("********** isEmpty() ***************");
// String sEmp1 = "";
// String sEmp2 = "Hello";
// System.out.println(sEmp1.isEmpty());
// System.out.println(sEmp2.isEmpty());


// System.out.println("********** join() ***************");
// String sJoin = String.join("---", "Hello", "World");
// System.out.println(sJoin);


// System.out.println("********** length() ***************");
// String sLen = "Hello";
// System.out.println(sLen.length());


// System.out.println("********** replace() ***************");
// String sRep = "Hello";
// System.out.println(sRep.replace("l", "n"));


// System.out.println("********** replaceAll() ***************");
// String sRepAll = "He123o";
// System.out.println(sRepAll.replaceAll("\\d", "n"));


// System.out.println("********** toCharArray() ***************");
// String sChArr = "Hello";
// char[] arr = sChArr.toCharArray();
// System.out.println(arr);


// System.out.println("********** toLowerCase() ***************");
// String sLow = "WORLD";
// System.out.println(sLow.toLowerCase());


// System.out.println("********** toUpperCase() ***************");
// String sUpp = "world";
// System.out.println(sUpp.toUpperCase());