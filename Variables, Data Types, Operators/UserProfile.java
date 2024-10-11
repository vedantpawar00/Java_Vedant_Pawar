// Activity 2: My First Variable Naming
// Open your IntelliJ Idea IDE and follow the instructions below
// Create a project called MyFirstVariableNaming
// Create a class titled "UserProfile"
// Write code so that the app stores a users name, age, gender, job preference, nationality and blood type
// Think about what variable names you want to assign to the properties above and variable name conventions to be followed.
// Use the age to calculate the year when a user was born.
// Print the values back to a user's console.


import java.util.Scanner;

public class UserProfile 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter gender: ");
        String gender = sc.nextLine();
        
        System.out.print("Enter job preference: ");
        String jobPreference = sc.nextLine();

        System.out.print("Enter nationality: ");
        String nationality = sc.nextLine();
        
        System.out.print("Enter blood type: ");
        String bloodType = sc.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Job Preference: " + jobPreference);
        System.out.println("Nationality: " + nationality);
        System.out.println("Blood Type: " + bloodType);
        System.out.println("Year of Birth: " + calBirthYear(age));

        sc.close();
    }

    public static int calBirthYear(int age)
    {
        int currentYear = 2024;
        return currentYear - age;
    }
}
