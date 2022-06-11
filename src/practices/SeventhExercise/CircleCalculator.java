package practices.SeventhExercise;

public class CircleCalculator {

    static int radius;

    public static double diameter() {
        return 2 * radius;
    }

    public static double area() {
        return Math.PI * radius * radius;
    }

    public static double circumference() {
        return 2 * Math.PI * radius;
    }

}
