import java.util.*;

public class lesson4e1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String fName = input.nextLine();

        System.out.print("Enter your last name: ");
        String lName = input.nextLine();

        System.out.print("Enter the total value of order: £");
        double price = input.nextDouble();

        System.out.print("Enter deposit amount: £");
        double deposit = input.nextDouble();


        System.out.println("== RECEIPT ==");
        System.out.println("Customer: " + fName.substring(0,1) + " " + lName);
        System.out.println("Order Total: £" + price);
        System.out.println("deposit paid: £" + deposit);
        System.out.println("remainder: £" + (price-deposit));

        if (deposit > 100){
            System.out.println("!YOU GET A FREE TOASTER!");
        }
        System.out.print("Have a greeaaaat day");


    }
}
