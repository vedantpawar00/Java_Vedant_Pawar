// Part 2: Weight Guru Challenge
// Create a Java program that tells whether your body to weight ratio is good or could be better.
// The java app should take in your weight and height from the console and calculate your body to weight ratio.
// You can use this article as a standardized guide for how to apply the logic.

import java.util.Scanner;

public class WeightGuru 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Weight in kg: ");
        float weight = sc.nextFloat();
        System.out.print("Enter height in feet: ");
        float height = 0.3048f*(sc.nextFloat());

        float BMI = calcBMI(weight, height);
        String result = AnalyseBMI(BMI);

        System.out.println("BMI: " + BMI);
        System.out.println("Result is: " + result);

        sc.close();
    }

    public static float calcBMI(float w, float h)
    {
        return w/(h*h);
    }

    public static String AnalyseBMI(float BMI)
    {
        if(BMI < 18.5)
        {
            return "Underweight";
        }
        else if(BMI>=18.5 && BMI<=24.9)
        {
            return "Normal weight";
        }
        else if(BMI>=25 && BMI<=29.9)
        {
            return "Overweight";
        }
        else
        {
            return "Obesity";
        }
    }

}
