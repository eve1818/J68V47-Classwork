import java.util.*;
public class lesson7e2 {
    public static void calculateSum (int numOne, int numTwo){
        int answer = numOne + numTwo;
        System.out.println("The sum of " + numOne + " + " + numTwo + " is " + answer );
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNum = input.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum = input.nextInt();

        calculateSum(firstNum, secondNum);
    }
}
