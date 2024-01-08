import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.io.File;

public class hangman1 {
    public static String getWord(){
        String answerWord = "";
        String[] words = {"lantern", "table", "alarm", "spider", "circus", "robot", "tower", "alien", "sun", "light"};
        System.out.println("1. Get a random word");
        System.out.println("2. Type in your own word");
        Scanner input = new Scanner(System.in);
        int wordWant = input.nextInt();
        if (wordWant == 2){
            System.out.print("Enter the word you want: ");
            Scanner inpu = new Scanner(System.in);
             answerWord = inpu.nextLine();
        } else if (wordWant == 1) {
            Random randomNum = new Random();
            int random = randomNum. nextInt(10);
            answerWord = words[random];
        }
        return answerWord;
    }

    public static String guessWord(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is your guess: ");
        String guess = input.nextLine();
        return guess;
    }

    public static String checkGuess(String userGuess, String letterGuessed){
        boolean rightGuess = false;
        boolean contains = letterGuessed.contains(userGuess);
        while (rightGuess = false){
            if (contains = true){
                rightGuess = true;
            } else{
                System.out.println("you have already guessed that letter");
                System.out.println("these are the letters you have left " + letterGuessed);
                System.out.print("please guess again: ");
                Scanner input = new Scanner(System.in);
                letterGuessed = input.nextLine();
                contains = letterGuessed.contains(userGuess);

            }
        }
        letterGuessed = letterGuessed.replace(userGuess, ".");
        String updateGuess = userGuess.substring(0,1);
        return updateGuess;
    }

    public static boolean guessCorrect(String answerWord, String userGuess, String[] letters){
        //not used
        char l = userGuess.charAt(0);
        boolean guessCorrect = false;
        for( int i=0; i<answerWord.length(); i++ ){
            char check = answerWord.charAt(i);
            if (check == l){
                letters[i] = userGuess;
                guessCorrect = true;
            }
        }
        return guessCorrect;
    }
    public static void main(String[] args) {
        int userHealth = 100;
        int monsterHealth = 100;

        while (userHealth > 0 && monsterHealth > 0){
            int lives = 10;
            String answerWord = getWord();
            System.out.println(answerWord);
            String letterGuessed = "abcdefghijklmnopqrstuvwxyz";
            String wordright = "false";
            while (lives > 0 && wordright.equals("false")){
                System.out.println("you have " + lives + " lives");
                String[] letters = new String[answerWord.length()];
                for( int i=0; i<letters.length; i++ ){
                    letters[i] = "_";
                }
                int wordLength = answerWord.length();
                int rightGuess = 0;
                System.out.print("word: ");
                for( int i=0; i<letters.length; i++ ){
                    System.out.print(letters[i]);
                }
                System.out.println();
                String userGuess = guessWord();
                String updateGuess = checkGuess(userGuess, letterGuessed);
                char l = userGuess.charAt(0);
                boolean guessCorrect = false;
                for( int i=0; i<answerWord.length(); i++ ){
                    char check = answerWord.charAt(i);
                    if (check == l){
                        letters[i] = userGuess;
                        guessCorrect = true;
                    }
                }
                if (guessCorrect = false){
                    lives--;
                }
                System.out.println();
                int count = 0;
                for( int i=0; i<letters.length; i++ ){
                    if (letters[i].equals("_")){
                        count++;
                    }
                }
                if (count == 0){
                    wordright = "true";
                }
            }
        }
    }
}
