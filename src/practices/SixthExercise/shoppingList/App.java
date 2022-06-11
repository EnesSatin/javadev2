package practices.SixthExercise.shoppingList;

import java.util.ArrayList;
import java.util.Scanner;


public class App {

    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the option: ");
        int option = scanner.nextInt();

        shoppingList.add("Banana");
        shoppingList.add("Milk");
        shoppingList.add("Egg");

        if (option == 1) {
            shoppingList.add("Vegetables");
            shoppingList.add("Bread");
            shoppingList.add("Cheese");
            shoppingList.add("Olives");
            System.out.println(shoppingList);
        } else if (option == 2) {
            shoppingList.remove("Milk");
            shoppingList.remove("Egg");
            System.out.println(shoppingList);
        } else if (option == 3) {
            System.out.println(shoppingList);
        }
    }
}
