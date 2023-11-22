import java.util.*;
import java.io.*;

public class lesson11e1 {
    public static void main(String[] args) {
        for( int count=1; count<=12; count++ ) {
            System.out.println(count);
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int number = input.nextInt();

        try {
            PrintWriter out = new PrintWriter( new FileWriter("timesTables.txt") );
            for(int count=0; count<=12; count++){
                int answer = (number * count);
                out.println(number + " x " + count + " = " + answer);

            }
            out.close();
        } catch (IOException e){
            System.out.println("Error occurred writing to file: " + e.toString());
        }
    }
}
