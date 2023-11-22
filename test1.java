import java.util.*;
public class test1 {
    public static void main(String[] args) {
        String word = "cat";
        int number = word.length() - 1;
        System.out.println(number);
        String[] charecter = new String[number+1];
        for (int count = 0; count < number; count++){
            charecter[count] = word.substring(count,count+1);
        }
        charecter[word.length()] = word.substring(word.length()-1,word.length());
        for (int count = 0; count < number; count++){
            System.out.println(charecter[count]);
        }
    }
}
