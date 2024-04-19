import java.util.*;
import java.io.*;
import java.io.FileReader;

public class hangman1 {

    //get the word based off what the user wants
    public static String getWord(){
        String answerWord = "";
        boolean correct = false;
        String[] words = {"lantern", "table", "alarm", "spider", "circus", "robot", "tower", "alien", "sun", "light", "fried", "paranormal", "darkness", "toaster", "makeup", "curtain", "lonely"};
        while(correct == false) {
            System.out.println("1. Get a random word (one player)");
            System.out.println("2. Type in your own word (two player)");
            Scanner input = new Scanner(System.in);
            System.out.print("What would you like to do: ");
            String wordWant = input.nextLine();
            if (wordWant.equals("2")) {
                System.out.print("Enter the word you want: ");
                Scanner inpu = new Scanner(System.in);
                answerWord = inpu.nextLine();
                answerWord = answerWord.toLowerCase();
                correct = true;
            } else if (wordWant.equals("1")) {
                Random randomNum = new Random();
                int random = randomNum.nextInt(14);
                answerWord = words[random];
                correct = true;
            } else {
                System.out.println("please enter the one of the options (1 or 2) ");
            }
        }
        System.out.println();
        return answerWord;
    }

    //get one guess from the user
    public static String guessWord(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your guess (it can only be one letter): ");
        String guess = input.nextLine();
        guess = guess.toLowerCase();
        return guess;
    }

    //check to see if they have only guessed one letter and if they have guessed the letter before
    public static String checkGuess(String userGuess, String letterGuessed){
        boolean rightguess1 = false;

        while (rightguess1 == false){
            int length = userGuess.length();
            if (length == 1){
                rightguess1 =true;
            } else{
                System.out.println("You can only guess one letter");
                System.out.print("please guess again: ");
                Scanner input = new Scanner(System.in);
                userGuess = input.nextLine();
                System.out.println();
            }
        }


        boolean rightGuess = false;
        boolean contains = letterGuessed.contains(userGuess);
        while (rightGuess == false){
            if (contains == true){
                rightGuess = true;
            } else{
                System.out.println("you have already guessed that letter (or you didn't guess a letter)");
                System.out.println("these are the letters you have left " + letterGuessed);
                System.out.print("please guess again: ");
                Scanner input = new Scanner(System.in);
                userGuess = input.nextLine();
                System.out.println();
                contains = letterGuessed.contains(userGuess);

            }
        }

        boolean rightGuess2 = false;
        boolean contains2 = userGuess.contains(".");
        while (rightGuess2 == false){
            if (contains2 == false){
                rightGuess2 = true;
            } else{
                System.out.println("you have already guessed that letter (or you didn't guess a letter)");
                System.out.println("these are the letters you have left " + letterGuessed);
                System.out.print("please guess again: ");
                Scanner input = new Scanner(System.in);
                userGuess = input.nextLine();
                System.out.println();
                contains2 = userGuess.contains(".");

            }
        }
        String updateGuess = userGuess.substring(0,1);
        return updateGuess;
    }

    //print out hangman man showing how many lives are left
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
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("-----");

        } else if (lives == 10) {
            System.out.println("You have " + lives + " lives left");

        }
    }

    //main code
       public static void main(String[] args) {
        System.out.println("....Game Starting...");
        System.out.println("Welcome to ULTIMATE HANGMAN");
        System.out.println("Try to guess the word and beat the monster");
        System.out.println("But watch out in case your health gets too low");
        System.out.println();
        int userHealth = 100;
        int monsterHealth = 100;

        System.out.println("Monster Health: " + monsterHealth);
        System.out.println("User Health: " + userHealth);
        System.out.println("");

        while (userHealth > 0 && monsterHealth > 0){
            int lives = 10;
            String answerWord = getWord();
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
                System.out.print("word: ");
                for( int i=0; i<letters.length; i++ ){
                    System.out.print(letters[i]);
                }
                System.out.println();
                String userGuess = guessWord();
                String updateGuess = checkGuess(userGuess, letterGuessed);
                letterGuessed = letterGuessed.replace(updateGuess,".");
                char l = updateGuess.charAt(0);
                boolean guessCorrect = false;
                for( int i=0; i<answerWord.length(); i++ ){
                    char check = answerWord.charAt(i);
                if (check ==  l){
                        letters[i] = updateGuess;
                        guessCorrect = true;
                    }
                }
                if (guessCorrect == false){
                    lives = lives -1;
                    System.out.println("the letter is not in the word (sorry)");
                } else{
                    System.out.println("The letter is in the word :)");
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
                monsterHealth = monsterHealth - 25;
                printLives(lives);
                System.out.println("!YOU FOUND OUT THE WORD!");
                System.out.println("The word was: " + answerWord);
                System.out.println("The monster's health is getting lower");
                System.out.println();
            } else if (wordright.equals("false")) {
                userHealth = userHealth -25;
                printLives(lives);
                System.out.println("!!You couldn't find the word!!");
                System.out.println("The word was: " + answerWord);
                System.out.println("be careful your health is getting lower");
                System.out.println();
            }
            System.out.println("Monster Health: " + monsterHealth);
            System.out.println("User Health: " + userHealth);
            System.out.println("________");
            System.out.println();
        }
        if (userHealth == 0){
            System.out.println("!THE MONSTER BEAT YOU AND YOU LOST (sorry)!");
            System.out.println("sorry");
        } else if (monsterHealth == 0) {
            System.out.println("!!YOU BEAT THE MONSTER AND WON!!");
            System.out.println("You can now put your name on the winners list");
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String winner = input.nextLine();

            String previousWinners = "";
            try{
                BufferedReader in = new BufferedReader( new FileReader("hangmanWinners.txt") );
                previousWinners = in.readLine();

            }catch (IOException e){
                System.out.println("sorry something went wrong when writing your name to file");
            }
            if (previousWinners == null){
                previousWinners = " ";
            }
            try{
                FileWriter out = new FileWriter("hangmanWinners.txt");
                out.write(winner + ", " + previousWinners);
                out.close();

            } catch (IOException e){
                System.out.println("sorry something went wrong when writing your name to file");
            }

        }
        System.out.println("...game finished...");
    }

}