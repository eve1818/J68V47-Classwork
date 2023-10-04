import java.util.*;
public class lesson5extraA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to multiply by: ");
        int numberOne = input.nextInt();

        System.out.print(("Enter number to be multiplied up to: "));
        int numberTwo = input.nextInt();

        for (int count=1; count<=numberTwo; count++){
            System.out.println(count + " x " + numberOne + " = " + (numberOne*count));
        }
    }
}
