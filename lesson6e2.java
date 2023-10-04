import java.util.*;
public class lesson6e2 {
    public static void main(String[] args) {
        int option = 0;

        do{
            Scanner input = new Scanner(System.in);
            System.out.println("1. say hello");
            System.out.println("2. Tell a joke");
            System.out.println("3. say the date");
            System.out.println("4. Quite");
            System.out.print("Enter the number of what you want to do: ");
            option = input.nextInt();

            if (option == 1){
                System.out.println("!HELLO!");
            }
            else if (option == 2){
                System.out.println("Who did the skeleton go to the dance with?");
                System.out.println("No body");
            }
            else if (option == 3){
                System.out.println("It is the 4th of October");
            }
            else if (option > 4){
                System.out.println("That is not a valid option");
            }

            System.out.println("---");

        } while (option != 4);
    }
}
