import java.util.*;
public class Leson6e3 {
    public static void main(String[] args) {
        int correct = 0;
        int lives = 3;
        int counter = 10;

        while (lives > 0) {
            if (counter != 0){
                Scanner input = new Scanner(System.in);
                Random rand = new Random();
                int randomNum = rand.nextInt(100);
                int randomNumTwo = rand.nextInt(100);
                System.out.print(randomNum + " +" + randomNumTwo + " = ");
                int answer = input.nextInt();

                if (answer == (randomNum + randomNumTwo)) {
                    correct += 1;
                    System.out.println("!THAT IS CORRECT!");
                }
                else{
                    lives = lives-1;
            }
                counter = counter-1;
            }

            if (counter == 0){
                lives = 0;
            }
        }
        System.out.println("you got " + correct + " answers corrects overall");

        System.out.println("you have " + (10 - (10-correct)) + " lives left");
        if ((10 - (10-correct)) > 0){
            System.out.println("!WELL DONE FOR NOT LOSING ALL YOUR LIVES!");
        }
    }
}