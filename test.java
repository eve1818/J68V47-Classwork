import java.util.*;
public class test {
    public static void main(String[] args) {
        String word = "cat";
        String letter = "a";
        String[] letters = new String[word.length()];

        for (int count=0; count<=3; count++){
            letters[count]= word.substring(0,count-1);
            count += 1;
        }
        for (int index=0; index<=3 ; index++){
            if (letters[index] == letter){
                System.out.print(letter);
            } else {
                System.out.print("_");
            }
        }

    }
}
