package practices.SeventhExercise;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        CircleCalculator cc = new CircleCalculator();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        cc.radius = scanner.nextInt();

        System.out.println("Enter the circle's radius: " + cc.radius);
        System.out.println("Diameter: " + cc.diameter());
        System.out.println("Area: " + cc.area());
        System.out.println("Circumference: " + cc.circumference());



    }


}
