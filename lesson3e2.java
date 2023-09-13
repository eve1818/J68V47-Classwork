import java.util.*;
public class lesson3e2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is a group of Dolphins called: ");
        String answerOne = input.nextLine();

        System.out.print("What is a group of Puffins called: ");
        String answerTwo = input.nextLine();

        System.out.print("What is a group of crows called: ");
        String answerThree = input.nextLine();

        boolean markOne = answerOne.toLowerCase().contains("pod");
        boolean markTwo = answerTwo.toLowerCase().contains("circus");
        boolean markThree = answerThree.toLowerCase().contains("murder");

        System.out.println("your first answer is " + markOne);
        System.out.println("your second answer is " + markTwo);
        System.out.println("your third answer is " + markThree);
    }
}
