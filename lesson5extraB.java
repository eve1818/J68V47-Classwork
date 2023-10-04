import java.util.*;
public class lesson5extraB {
    public static void main(String[] args) {
        int correct = 0;
        Random rand = new Random();
        int randomNum = rand.nextInt(100);

        for (int count=1; count<=5; count++){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter guess: ");
            int guess = input.nextInt();

            if (guess == randomNum){
                 correct = 1;
            }

        }
        if (correct == 1){
            System.out.println("!YOU GUESSED IT!");
            System.out.println("The answer was " + randomNum);
        }
        else {
            System.out.println("!YOU GOT OT WRONG!");
            System.out.println("The answer was " + randomNum);
        }
    }
}
