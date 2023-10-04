import java.util.*;
public class lesson5e1 {
    public static void main(String[] args) {
        for( int count=1; count<=12; count++ ) {
            System.out.println(count);
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int number = input.nextInt();

        for(int count=0; count<=12; count++){
            int answer = (number * count);
            System.out.println(number + "x" + count + "=" + answer);

        }
    }
    }

