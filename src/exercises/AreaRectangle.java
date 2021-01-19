package exercises;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Length?");
        double length = input.nextDouble();
        System.out.println("Width?");
        double width = input.nextDouble();
        double area = length * width;
        System.out.println(area);
    }
}
