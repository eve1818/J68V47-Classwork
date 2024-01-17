import java.util.*;
import java.io.*;
import java.io.FileReader;

public class hangman1 {
    public static String getWord(){
        String answerWord = "";
        String[] words = {"lantern", "table", "alarm", "spider", "circus", "robot", "tower", "alien", "sun", "light", "fried"};
        System.out.println("1. Get a random word");
        System.out.println("2. Type in your own word");
        Scanner input = new Scanner(System.in);
        int wordWant = input.nextInt();
        if (wordWant == 2){
            System.out.print("Enter the word you want: ");
            Scanner inpu = new Scanner(System.in);
             answerWord = inpu.nextLine();
             answerWord = answerWord.toLowerCase();
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
        guess = guess.toLowerCase();
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

    public static void printLives(int lives){
        if (lives == 0){
            System.out.println("You have " + lives + " lives left");
            System.out.println("  _____");
            System.out.println("  |   |");
            System.out.println("  |   O");
            System.out.println("  |  /|!");
            System.out.println("  |  /|");
            System.out.println("  |");
            System.out.println("-----");

        } else if (lives == 1) {
            System.out.println("You have " + lives + " lives left");
            System.out.println("  _____");
            System.out.println("  |   |");
            System.out.println("  |   O");
            System.out.println("  |  /|!");
            System.out.println("  |  /");
            System.out.println("  |");
            System.out.println("-----");

        } else if (lives == 2) {
            System.out.println("You have " + lives + " lives left");
            System.out.println("  _____");
            System.out.println("  |   |");
            System.out.println("  |   O");
            System.out.println("  |  /|!");
            System.out.println("  | ");
            System.out.println("  |");
            System.out.println("-----");

        } else if (lives == 3) {
            System.out.println("You have " + lives + " lives left");
            System.out.println("  _____");
        System.out.println("  |   |");
        System.out.println("  |   O");
        System.out.println("  |  /|");
        System.out.println("  | ");
        System.out.println("  |");
        System.out.println("-----");

    }  else if (lives == 4) {
            System.out.println("You have " + lives + " lives left");
            System.out.println("  _____");
            System.out.println("  |   |");
            System.out.println("  |   O");
            System.out.println("  |   |");
            System.out.println("  | ");
            System.out.println("  |");
            System.out.println("-----");

        } else if (lives == 5) {
            System.out.println("You have " + lives + " lives left");
            System.out.println("  _____");
            System.out.println("  |   |");
            System.out.println("  |   O");
            System.out.println("  |   ");
            System.out.println("  | ");
            System.out.println("  |");
            System.out.println("-----");

        } else if (lives == 6) {
            System.out.println("You have " + lives + " lives left");
            System.out.println("  _____");
            System.out.println("  |   |");
            System.out.println("  | ");
            System.out.println("  | ");
            System.out.println("  | ");
            System.out.println("  |");
            System.out.println("-----");

        } else if (lives == 7) {
            System.out.println("You have " + lives + " lives left");
            System.out.println("  _____");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |   ");
            System.out.println("  | ");
            System.out.println("  |");
            System.out.println("-----");

        }else if (lives == 8) {
            System.out.println("You have " + lives + " lives left");
            System.out.println(" ");
            System.out.println("  |   ");
            System.out.println("  |   ");
            System.out.println("  |   ");
            System.out.println("  | ");
            System.out.println("  |");
            System.out.println("-----");

        } else if (lives == 9) {
            System.out.println("You have " + lives + " lives left");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("-----");

        } else if (lives == 10) {
            System.out.println("You have " + lives + " lives left");

        }
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

        System.out.println("Monster Health: " + monsterHealth);
        System.out.println("User Health: " + userHealth);
        System.out.println("");

        while (userHealth > 0 && monsterHealth > 0){
            int lives = 10;
            String answerWord = getWord();
            System.out.println(answerWord);
            String[] letters = new String[answerWord.length()];
            for( int i=0; i<letters.length; i++ ){
                letters[i] = "_";
            }
            String letterGuessed = "abcdefghijklmnopqrstuvwxyz";
            String wordright = "false";
            while (lives > 0 && wordright.equals("false")){
                printLives(lives);
                System.out.println("The letters you haven't guessed are: " + letterGuessed);
                int wordLength = answerWord.length();
                int rightGuess = 0;
                System.out.print("word: ");
                for( int i=0; i<letters.length; i++ ){
                    System.out.print(letters[i]);
                }
                System.out.println();
                String userGuess = guessWord();
                String updateGuess = checkGuess(userGuess, letterGuessed);
                letterGuessed = letterGuessed.replace(updateGuess," ");
                char l = updateGuess.charAt(0);
                boolean guessCorrect = false;
                for( int i=0; i<answerWord.length(); i++ ){
                    char check = answerWord.charAt(i);
                if (check ==  l){
                        letters[i] = userGuess;
                        guessCorrect = true;
                    }
                }
                System.out.println(guessCorrect);
                if (guessCorrect == false){
                    lives = lives -1;
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
            if (wordright.equals("true")){
                monsterHealth = monsterHealth - 100;
                System.out.println("!YOU FOUND OUT THE WORD");
                System.out.println("Now the monster loses health");
                System.out.println("");
            } else if (wordright.equals("false")) {
                userHealth = userHealth -25;
                System.out.println("You couldn't find the word");
                System.out.print("this means you lose health and the monster lives on");
                System.out.println("");
            }
            System.out.println("Monster Health: " + monsterHealth);
            System.out.println("User Health: " + userHealth);
            System.out.println("________");
            System.out.println();
        }
        if (userHealth == 0){
            System.out.println("!You Lost!");
            System.out.println("sorry");
        } else if (monsterHealth == 0) {
            System.out.println("!!YOU WON!!");
            System.out.println("You can now put your name on the winners list");
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String winner = input.nextLine();

            String[] readingFile = {"", "", "", "", "", "", "", "", "", "", "", "", "","","",""};
            int count = 0;

            try {
                BufferedReader i = new BufferedReader(new FileReader("winners.txt"));
                String winnerFile = "";
                winnerFile = i.readLine();
                PrintWriter out = new PrintWriter( new FileWriter("winners.txt") );
                System.out.print(winnerFile);
                System.out.print(winner);
            } catch (IOException e){
                System.out.println("Sorry something went wrong when writing your name to file");
            }
        }
    }
}
