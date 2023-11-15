import java.util.*;
public class lesson7extra1 {

    public static void menu(){
        System.out.println("------");
        System.out.println("1. Very easy maths (for idiots)");
        System.out.println("2. Hard maths (for the smart people)");
        System.out.println("3. exit (if you are too dumb for mathematics)");
    }

    public static int getOption(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the option: ");
        int option = input.nextInt();
        System.out.println("------");
        return option;
    }

    public static int easyQuestion(){
        int correct = 0;
        Random rand = new Random();
        int numOne = rand.nextInt(10);
        int numTwo = rand.nextInt(10);
        System.out.print(numOne + " + " + numTwo + " = ");
        Scanner input = new Scanner(System.in);
        int userAswer = input.nextInt();
        int answer = numOne + numTwo;
        if (userAswer == answer){
             correct = 1;
        }
        else{
             correct =2;
        }
        return correct;
    }
    public static int hardQuestion(){
        int correct = 0;
        Random rand = new Random();
        int numOne = rand.nextInt(100);
        int numTwo = rand.nextInt(100);
        System.out.print(numOne + " + " + numTwo + " = ");
        Scanner input = new Scanner(System.in);
        int userAnswer = input.nextInt();
        int answer = numOne + numTwo;
        if (userAnswer == answer){
            correct = 1;
        }
        else{
            correct =2;
        }
        return correct;
    }

    public static int correct(int score){
        System.out.println("!CORRECT!");
        score = score + 1;
        return score;
    }

    public static int wrong(int lives){
        System.out.println("you got it wrong (idiot)");
        lives = lives - 1;
        System.out.println("you have " + lives + " lives left");
        return lives;
    }

    public static void gameOver(int score, int lives){
        System.out.println("!GAME OVER!");
        System.out.println("you had a score of " + score);
        if (lives > 0){
            System.out.println("Well done you didn't lose all of your lives");
        }
    }

    public static void main(String [] args) {
        int score = 0;
        int lives = 3;
        int userAnswer = 0;
        int answer = 0;
        int count = 1;
        int option = 0;

        while(count<=10 && lives>0 && option!=3) {
            menu();
            option = getOption();

            if (option == 1) {
                answer = easyQuestion();
            } else if (option == 2){
                answer = hardQuestion();
            }
            if (answer == 1){
                score = correct(score);
            }
            else if (answer == 2){
                lives = wrong(lives);
            }
            count = count + 1;
        }
        if (option!=3) {
            gameOver(score, lives);
        }
    }
}