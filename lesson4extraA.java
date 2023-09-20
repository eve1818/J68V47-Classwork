import java.util.*;
public class lesson4extraA {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter guess: ");
        int guess = input.nextInt();

        if (guess > randomNum){
            System.out.println("you are too high");
        }

        if (guess < randomNum){
            System.out.println("you are too low");
        }
        if (guess == randomNum){
            System.out.print("you guessed correctly");
        }

        System.out.print(randomNum);


    }
}
