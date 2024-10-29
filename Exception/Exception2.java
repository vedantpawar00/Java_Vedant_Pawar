// public class Exception2 
// {
//     public static void main(String[] args) 
//     {
//         int num = 5;  // Example float value

//         try 
//         {
//             // Checking if num is not an integer
//             // if(num ==)
//             if (num != (int) num) 
//             {
//                 // Throwing an exception if the number is not an integer
//                 throw new NumberFormatException("The number is a float, not an integer");
//             }

//             System.out.println("The number is an integer: " + (int) num);

//         } catch (NumberFormatException e) {
//             // Catching the exception and printing the message
//             System.out.println("Caught exception: " + e.getMessage());
//         }

//         System.out.println("Rest of the code continues...");
//     }
// }





// public class Exception2 {

//     // Method to perform division
//     public static void Division(int a, float b) throws ArithmeticException {
//         // Check if the division is valid; if b is a float (not an integer), throw an exception
//         if (b % 1 != 0) { // Checks if b is not a whole number
//             throw new ArithmeticException("Cannot divide integer by a non-integer float.");
//         }

//         // Performing division
//         float result = a / b;
//         System.out.println("Division result: " + result);
//     }

//     public static void main(String[] args) {
//         int a = 2;           // Example integer
//         float b = 3.4f;     // Example float (change this to test with a whole number)

//         try {
//             Division(a, b); // Calling the Division method
//         } catch (ArithmeticException e) {
//             // Catching the exception and printing the message
//             System.out.println("Caught exception: " + e.getMessage());
//         }

//         System.out.println("Rest of the code continues...");
//     }
// }




public class Exception2 {

    // Method to perform division
    public static void Division(int a, float b) throws ArithmeticException {
        // Check if b is effectively an integer
        if (b != (int) b) { // Checks if b is not a whole number
            throw new ArithmeticException("Cannot divide integer by a non-integer float.");
        }

        // Performing division with type casting
        float result = a / (int) b; // Cast b to int for division
        System.out.println("Division result: " + result);
    }

    public static void main(String[] args) {
        int a = 2;           // Example integer
        float b = 3.4f;     // Example float (change this to test with a whole number)

        try {
            Division(a, b); // Calling the Division method
        } catch (ArithmeticException e) {
            // Catching the exception and printing the message
            System.out.println("Caught exception: " + e.getMessage());
        }

        System.out.println("Rest of the code continues...");
    }
}


