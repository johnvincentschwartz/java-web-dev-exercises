package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void printArea() {

        Scanner input;
        double radius;

        input = new Scanner(System.in);
        System.out.println("Radius?");
        radius = input.nextDouble();
        input.close();
        Double area = Circle.getArea(radius);

        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
