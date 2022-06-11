package practices.FifthExercise;

public class App {

    public static void main(String[] args) {

        int x = 0;
        int y = 1;
        int z;

        int count = 5;

        for (int i = 1; i <= count; i++) {
            System.out.println(x);
            z = x + y;
            x = y;
            y = z;


            /*
                    0  1  1  2  3  5  8
                    x  y  z
                       x  y  z
                          x  y  z
                             x  y  z
                                x  y  z
             */

        }
    }


}
