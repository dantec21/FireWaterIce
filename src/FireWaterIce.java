import java.util.Scanner;

public class FireWaterIce {
    public static void main(String []args){
        //int [] myNumbers = new int[5];
       // for(int i=0;i<myNumbers.length );
        Scanner keyboard = new Scanner(System.in);
        while (1==1){
        System.out.println("Fire, Water, Ice");
        System.out.println("Water beats fire");
        System.out.println("Fire beats ice");
        System.out.println("Ice beats water");
        System.out.println("Pick between the three elements and I will tell you whether or not you beat me.");
        String decision = keyboard.nextLine();
        game(decision);
        }

    }
    public static void game(String decision){
        int pickedNumber = (int) (Math.random()* 3);
        switch (pickedNumber){
            case 0:

        }

    }





}
