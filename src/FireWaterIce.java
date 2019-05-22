import java.util.Scanner;

public class FireWaterIce {
    public static void main(String args[]) {
        int [] myNumbers = new int[5];
        for(int i=0;i<myNumbers.length;i++) {
        }
        System.out.println("Fire, Water, Ice");
        System.out.println("Water beats fire");
        System.out.println("Fire beats ice");
        System.out.println("Ice beats water");


        System.out.println("1 is fire, 2 is water, 3 is ice.");
        game();


    }

    public static int game() {
        Scanner keyboard = new Scanner(System.in);
        int wins = 0;
        int losses = 0;

        while (1 == 1) {
            System.out.println("Pick between the three elements and I will tell you whether or not you beat me.");
            int decision = keyboard.nextInt();
            // 1 is fire, 2 is water, 3 is ice.
            int pickedNumber = (int) (Math.random() * 3);
            // 0 is fire, 1 is water, 2 is ice

            if (decision == 1) {
                if (pickedNumber == 0) {
                    System.out.println("We tied");
                }
                if (pickedNumber == 1) {
                    System.out.println("You lost");
                    losses++;
                }
                if (pickedNumber == 2) {
                    System.out.println("You won");
                    wins++;
                }
            }
            if (decision == 2) {
                if (pickedNumber == 0) {
                    System.out.println("You won");
                    wins++;
                }
                if (pickedNumber == 1) {
                    System.out.println("We tied");
                }
                if (pickedNumber == 2) {
                    System.out.println("You lost");
                    losses++;
                }
            }
            if (decision == 3) {
                if (pickedNumber == 0) {
                    System.out.println("You lost");
                    losses++;
                }
                if (pickedNumber == 1) {
                    System.out.println("You won");
                    wins++;

                }
                if (pickedNumber == 2) {
                    System.out.println("We tied");
                }
            }
            System.out.println("You have " + wins + " wins and " + losses + " losses.");

        }
    }
}









