import java.io.*;
import java.util.*;

public class lesson11e3 {
    public static void main(String[] args) {
        double total = 0;
        try{
            Scanner in = new Scanner( new FileReader("integers.txt") );
            while (in.hasNextLine()) {
                total = total + in.nextDouble();
                in.close();
            }
        }catch (IOException e){
            System.out.println("File unable to be read: " + e.toString());
        }
        System.out.println(total);
    }

}
