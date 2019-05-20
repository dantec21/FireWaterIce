import java.util.Scanner;

public class FireWaterIce {
    public static void main(String []args){


        //System.out.println("Fire, Water, Ice");
        //System.out.println("Water beats fire");
        //System.out.println("Fire beats ice");
        //System.out.println("Ice beats water");
        //while (1==1){
         //   System.out.println("1 is fire, 2 is water, 3 is ice.");
          //  game();
        //}
        int [] myNumbers = new int[5];
        for(int i=0;i<myNumbers.length;i++) {
            System.out.println(myNumbers[i]+1);
    }
    public static String game(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Pick between the three elements and I will tell you whether or not you beat me.");
        int decision = keyboard.nextInt();
        // 1 is fire, 2 is water, 3 is ice.
        int pickedNumber = (int) (Math.random()* 3);
        // 0 is fire, 1 is water, 2 is ice
        String winner;
        if (decision==1){
            if (pickedNumber==0){
                System.out.println("We tied");
            }
            if (pickedNumber==1){
                System.out.println("You lost");
            }
            if (pickedNumber==2){
                System.out.println("You won");
            }
        }
        if (decision==2){
            if (pickedNumber==0){
                System.out.println("You won");
            }
            if (pickedNumber==1){
                System.out.println("We tied");
            }
            if (pickedNumber==2) {
                System.out.println("You lost");
            }
        }
        if (decision==3){
            if (pickedNumber==0){
                System.out.println("You lost");
            }
            if (pickedNumber==1){
                System.out.println("You won");
            }
            if (pickedNumber==2) {
                System.out.println("We tied");
            }
        }
        return "error";

        }
    }





}
