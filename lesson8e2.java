import java.util.*;
public class lesson8e2 {
    public static void main(String[] args) {
        int total = 0;
        Scanner input = new Scanner(System.in);
        int[] scores = new int[10];

        for (int count = 0; count < scores.length; count++){
            System.out.print("Enter the exam score " + (count+1) + ": ");
            scores[count] = input.nextInt();
        }

        System.out.println("--------");
        System.out.println("The Exam scores are");
        for (int value : scores){
            System.out.println(value + "%");
            total = total+value;
        }
        int average = total/10;

        System.out.println("--------");
        System.out.println("The average exam score is " + average);

    }
}
