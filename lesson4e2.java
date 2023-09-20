import java.util.*;
public class lesson4e2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is a group of Dolphins called: ");
        String answerOne = input.nextLine();

        if (answerOne.toLowerCase().equals("pod")){
        }
        else {
            System.out.println("You are wrong (and an idiot) the answer is a pod");
        }

        System.out.print("What is a group of Puffins called: ");
        String answerTwo = input.nextLine();

        if (answerTwo.toLowerCase().equals("circus")){
        }
        else {
            System.out.println("You are wrong (and an idiot) the answer is a Circus");
        }

        System.out.print("What is a group of crows called: ");
        String answerThree = input.nextLine();

        if (answerThree.toLowerCase().equals("murder")){
        }
        else {
            System.out.println("You are wrong (and an idiot) the answer is a Murder");
        }

    }
}