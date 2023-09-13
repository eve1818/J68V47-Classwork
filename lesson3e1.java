import java.util.*;
public class lesson3e1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String fName = input.nextLine();

        System.out.print("Enter your last name: ");
        String lName = input.nextLine();

        System.out.print("Enter the year you were born: ");
        String bYear = input.nextLine();

        String username = fName.substring(0,1) + lName.toLowerCase();

        String password = lName.substring(0,1).toLowerCase() + fName.substring(0,3) + bYear;

        System.out.println("username:" + username);
        System.out.println("password:" + password);
    }
}
