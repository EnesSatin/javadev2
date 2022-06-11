package practices.ForthExercise;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        double totalPrice = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Meal deal option: ");
        int option = scanner.nextInt();

        switch (option){

            case 1:
                System.out.println("Burger");
                totalPrice = totalPrice + 3.5;
                System.out.println(totalPrice);
               break;

            case 2:
                System.out.println("Burger");
                System.out.println("Chips");
                totalPrice = totalPrice + 3.5 + 1.5;
                System.out.println(totalPrice);
                break;

            case 3:
                System.out.println("Burger");
                System.out.println("Chips");
                System.out.println("Drink");
                totalPrice = totalPrice + 3.5 + 1.5 + 1;
                System.out.println(totalPrice);
                break;

            default:
                System.out.println("Please select the option from 1 to 3");
        }
    }
}
