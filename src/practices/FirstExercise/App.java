package practices.FirstExercise;

public class App {

    public static void main(String[] args) {

        Developer developer = new Developer();

        developer.name = "Luke";
        developer.email = "luke@gmail.com";
        developer.language = "Java";

        System.out.println("Developer's name: " + developer.name);
        System.out.println("Developer's email: " + developer.email);
        System.out.println("Developer's language: " + developer.language);
    }
}
