import java.util.Scanner;

public class FireWaterIce {
    public static void main(String []args){
        //int [] myNumbers = new int[5];
       // for(int i=0;i<myNumbers.length );
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Fire, Water, Ice");
        System.out.println("Water beats fire");
        System.out.println("Fire beats ice");
        System.out.println("Ice beats water");
        while (1==1){
        System.out.println(game());
        }

    }
    public static String game(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Pick between the three elements and I will tell you whether or not you beat me.");
        int decision = keyboard.nextInt();
        // 1 is fire, 2 is water, 3 is ice.
        int pickedNumber = (int) (Math.random()* 3);
        // o is fire, 1 is water, 2 is ice
        if (pickedNumber == 0){
            return "I have picked fire, you ";
        }
        String winner;
        if (decision==1&&pickedNumber==)





        return "error";




    }





}
