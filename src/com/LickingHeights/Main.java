package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declare
        int weight,height;
        String name;
        double BMI;
        double InchesToMeters;
        double PoundsToKilograms;


        Scanner keyboard;

        keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        name = keyboard.nextLine();
        System.out.println("how much do you weigh?");
        weight = keyboard.nextInt();
        System.out.println("what is your height (only inches)?");
        height= keyboard.nextInt();
        InchesToMeters = height *(0.0254/1);
        System.out.println("your height from inches to meters is "+InchesToMeters+"m");
        PoundsToKilograms = weight *(0.453592/1);
        System.out.println("your yor weight from pounds to kilograms is "+PoundsToKilograms+"kg");
        BMI = PoundsToKilograms/ (InchesToMeters*InchesToMeters);
        System.out.println("your BMI is "+BMI);











    }
}
