package practices.ThirdExercise;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("In what year did WW1 begin? ");
        int year = scanner.nextInt();
        if (year == 1914) {
            System.out.println("That's it !!!");
        } else {
            System.out.println("Nope!");
        }
    }
}
