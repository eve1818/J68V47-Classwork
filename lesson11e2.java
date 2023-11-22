import java.io.*;
import java.util.*;
public class lesson11e2 {
    public static void main(String[] args) {

        try {
            BufferedReader in = new BufferedReader(new FileReader("timesTables.txt"));
            String line = "";
            while (line != null){
                line = in.readLine();
                if (line != null) {
                    System.out.println(line);
                }
                in.close();
            }

        } catch (IOException e) {
            System.out.println("error when reading file: " + e.toString());
        }
    }
}
