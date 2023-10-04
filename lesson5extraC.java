import java.util.*;
public class lesson5extraC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter pattern you want to be repeated: ");
        String pattern = input.nextLine();
        System.out.print("Enter how many times you want ot to be repeated: ");
        int repeat = input.nextInt();

        for (int counter=1; counter<= repeat; counter++ ){
            System.out.print(pattern);
        }
    }
}
