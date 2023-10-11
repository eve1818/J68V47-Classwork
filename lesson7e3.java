import java.util.*;
public class lesson7e3 {
    public static int askQuestion(int numOne, int numTwo){
        Scanner input = new Scanner(System.in);
        System.out.print(numOne + " + " + numTwo + ": ");
        int userAnswer = input.nextInt();
        return userAnswer;
    }

    public static int correct(int score){
        System.out.println("!CORRECT!");
        score += 1;
        return score;
    }

    public static int wrong(int answer, int lives){
        System.out.print("!You Are An Idiot And Got It Wrong");
        System.out.println(("the answer is " + answer));
        lives = lives-1;
        System.out.println("you have " + lives + " lives left");
        return lives;
    }

    public static void gameOver(int score, int lives){
        System.out.println("!GAME OVER!");
        System.out.println("your score was " + score);
        if (lives > 0){
            System.out.print("Well done, you didn't lose all of your lives");
        }
    }
    public static void main(String[] args) {
        int score = 0;
        int lives = 3;
        int userAnswer = 0;
        int answer = 0;
        int count = 1;

        while (count<=10 && lives>0){
            userAnswer = askQuestion(count, (count*count));
            answer = count+(count*count);
            if (userAnswer == answer){
                score = correct(score);
            }
            else{
                lives = wrong(answer,lives);
            }
            count += 1;
        }
        gameOver(score,lives);
    }
}
