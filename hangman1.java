import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.io.File;

public class hangman1 {
    public static String getWord(){
        String answerWord = "";
        System.out.println("1. Get word from file");
        System.out.println("2. Type in your own word");
        Scanner input = new Scanner(System.in);
        int wordWant = input.nextInt();
        if (wordWant == 2){
            System.out.print("Enter the word you want: ");
            Scanner inpu = new Scanner(System.in);
             answerWord = inpu.nextLine();
        } else if (wordWant == 1) {
            Random randomNum = new Random();
            int random = randomNum. nextInt(11);
            try {
                BufferedReader in = new BufferedReader(new FileReader("words.txt"));
                String[] line = new String [11];
                for( int i=0; i<11; i++ ){
                    line[i] = in.readLine();
                    in.close();
                     answerWord = line[random];
                }
            } catch (IOException e) {
                System.out.println("error when reading file: " + e.toString());
            }
        }
        return answerWord;
    }
    public static void main(String[] args) {
        int userHealth = 100;
        int monsterHealth = 100;
        String answerWord = getWord();
        System.out.println(answerWord);
        int wordLength = answerWord.length();
        int rightGuess = 0;
    }
}
