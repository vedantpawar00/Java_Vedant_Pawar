public class Array2 
{
    public static void main(String[] args) 
    {
        int[] arr = new int[10];
        for(int i=0; i<arr.length; i++)
        {
            // int y = i+20*300;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        byte[] arr2 = new byte[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (byte) (i + 2);  // Populating array with byte values
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        short[] arr3 = new short[10];
        for(int i=0; i<arr3.length; i++)
        {
            arr3[i] = (short) (i + 100);
            System.out.print(arr3[i] + " ");
        }
        System.out.println();

        long[] arr4 = new long[10];
        for(int i=0; i<arr4.length; i++)
        {
            arr4[i] = i + 500L;
            System.out.print(arr4[i] + " ");
        }
        System.out.println();

        float[] arr5 = new float[10];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = i + 0.5f; 
            System.out.print(arr5[i] + " ");
        }
        System.out.println();

        double[] arr6 = new double[10];
        for (int i = 0; i < arr6.length; i++) {
            arr6[i] = i + 0.123; 
            System.out.print(arr6[i] + " ");
        }
        System.out.println();

        char[] arr7 = new char[10];
        for (int i = 0; i < arr7.length; i++) {
            arr7[i] = (char) ('A' + i);  
            System.out.print(arr7[i] + " ");
        }
        System.out.println();

        boolean[] arr8 = new boolean[10];
        for (int i = 0; i < arr8.length; i++) {
            arr8[i] = (i % 2 == 0);  
            System.out.print(arr8[i] + " ");
        }

    }    
}
