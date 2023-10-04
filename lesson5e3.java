import java.util.*;
public class lesson5e3 {
    public static void main(String[] args) {
        int correct = 0;

        for (int counter=1; counter<=10; counter++){
            Scanner input = new Scanner(System.in);
            Random rand = new Random();
            int randomNum = rand.nextInt(100);
            int randomNumTwo = rand.nextInt(100);
            System.out.print(randomNum + " +" + randomNumTwo + " = ");
            int answer = input.nextInt();

            if (answer== (randomNum + randomNumTwo)){
                correct += 1;
                System.out.println("!THAT IS CORRECT!");
            }
        }
        System.out.print("you got " + correct + " answers corrects overall");
    }
}
