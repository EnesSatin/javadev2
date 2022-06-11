package practices.SixthExercise;

public class App {

    public static void main(String[] args) {


        String[] delegates = new String[6];

        delegates[0] = "Sarah";
        delegates[1] = "Simon";
        delegates[2] = "Kate";
        delegates[3] = "Tim";
        delegates[4] = "Michelle";

        System.out.println("The third delegate is: " + delegates[2]);

        System.out.println("The size of array: " + delegates.length);

        delegates[1] = "Jerry";
        delegates[5] = "Henry";

        for (int i = 0; i < delegates.length; i++) {
            System.out.println(delegates[i]);
        }

        System.out.println("-------------------------------------------------------");

        //delegates[6] = "Francis";
        //System.out.println(delegates[6]);

        delegates[3] = "";

        for (int i = 0; i < delegates.length; i++) {
            System.out.println(delegates[i]);
        }
    }

}
