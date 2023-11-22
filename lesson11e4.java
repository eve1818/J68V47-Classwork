import java.io.*;
import java.util.*;
public class lesson11e4 {
    public static void main(String[] args) {
        String[] readingFileOne = {"", "", "", "", "", "", "", "", "", "", "", "", "","","",""};
        String[] readingFileTwo = {"", "", "", "", "", "", "", "", "", "", "", "", "","","",""};
        int countOne = 1;
        int countTwo = 1;
        int right = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first file you want to compare: ");
        String fileOne = input.nextLine();
        System.out.print("Enter the second file you want to compare: ");
        String fileTwo = input.nextLine();

        try{
            BufferedReader in = new BufferedReader(new FileReader(fileOne));
            String line = "";
            while (line != null) {
                line = in.readLine();
                if (line != null) {
                    readingFileOne[countOne] = line;
                    countOne = countOne + 1;
                }
            }

            BufferedReader i = new BufferedReader(new FileReader(fileTwo));
            String lineTwo = "";
            while (lineTwo != null) {
                lineTwo = i.readLine();
                if (lineTwo != null) {
                    readingFileTwo[countTwo] = lineTwo;
                    countTwo = countTwo + 1;
                }
            }
        }catch (IOException e){
            System.out.println("Something went wrong when reading the files: " + e.toString());
        }

            for (int b = 1; b < readingFileTwo.length - 1; b++) {
                if (right ==1) {
                    if (readingFileOne[b].equals(readingFileTwo[b])) {
                        right = 1;
                    } else {
                        right = 0;
                    }
                }
            }

        if (right == 1){
            System.out.println("The files were identical");
        }else{
            System.out.println("The files were not identical");
        }

    }
}