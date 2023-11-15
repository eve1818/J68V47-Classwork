import java.util.*;
public class Lesson6e3v2 {
    public static void main(String[] args) {
        int correct = 0;
        int lives = 3;
        int counter = 10;

        while (counter != 0){
            if (lives != 0){
                Scanner input = new Scanner(System.in);
                Random rand = new Random();
                int randomNum = rand.nextInt(100);
                int randomNumTwo = rand.nextInt(100);
                System.out.print(randomNum + " + " + randomNumTwo + " = ");
                int answer = input.nextInt();

                if (answer == (randomNum + randomNumTwo)) {
                    correct += 1;
                    System.out.println("!THAT IS CORRECT!");
                }
                else{
                    lives =lives - 1;
                }
            }
            counter = counter - 1;
            }
        System.out.println("you got " + correct + " answers correct");
        System.out.println("you had " + lives + " lives left over");
        if (lives > 0){
            System.out.print("!WELL DONE FOR NOT LOSING ALL YOUR LIVES!");
        }

    }
}
