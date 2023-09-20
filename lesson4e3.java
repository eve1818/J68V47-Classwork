import java.util.*;
public class lesson4e3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your total purchase amount: £");
        double total = input.nextDouble();

        if (total<50){
            System.out.println("Shipping cost; £10");
            System.out.format("Total: £%.2f%n", (total + 10));
        }
        else{
            System.out.println("Shipping cost: £0");
            System.out.format("Total £%.2f%n", total);
        }

    }
}
