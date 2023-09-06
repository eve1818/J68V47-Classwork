import java.util.*;
public class story {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your favourite hobby: ");
        String hobby = input.nextLine();

        System.out.println(name + " loves " + hobby + ".\n" + name + " loves spending all their time " + hobby + " instead of doing homework." +
                "\nNow " + name  + " is behind in class because of their love for " + hobby + ".");

    }
}
