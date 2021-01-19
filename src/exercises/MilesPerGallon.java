package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles?");
        double miles = input.nextDouble();
        System.out.println("How many gallons?");
        double gallons = input.nextDouble();
        double milesPerGallon = miles / gallons;
        System.out.println(milesPerGallon + " miles per gallon, you're welcome");
    }
}
