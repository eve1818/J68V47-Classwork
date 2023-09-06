import java.util.*;
public class lesson2e3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the first item: ");
        String itemone = input.nextLine();
        System.out.print("Enter the price of the first item: ");
        float priceone = input.nextFloat();

        System.out.print("Enter the name of the second item: ");
        String itemtwo = input.nextLine();
        itemtwo = input.nextLine();
        System.out.print("Enter the price of the second item: ");
        float pricetwo = input.nextFloat();

        System.out.print("Enter the name of the third item: ");
        String itemthree = input.nextLine();
        itemthree = input.nextLine();
        System.out.print("Enter the price of the third item: ");
        float pricethree = input.nextFloat();

        System.out.println("Supermarket");
        System.out.println(itemone + "..." + priceone);
        System.out.println(itemtwo + "..." + pricetwo);
        System.out.println(itemthree + "..." + pricethree);
        System.out.format("SUBTOTAL = £%.2f%n",(priceone+pricetwo+pricethree));

    }
}
