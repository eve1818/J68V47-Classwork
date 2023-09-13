import java.util.*;
public class lesson3e3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the costs of a loan: £");
        int loan = input.nextInt();

        System.out.print("Enter the interest rate: ");
        int interest = input.nextInt();

        System.out.print("Enter the number of years for the loan: ");
        int years = input.nextInt();


        double x = Math.pow((1+interest), (years*-12));
        double monthly = loan * (interest / (1 -x));

        System.out.format("your monthly payment is £%.2f%n", monthly);
    }
}
