import java.util.*;
import java.io.File;
public class lesson9e2 {
    public static void exception1() {
        // exception 1
        try {
            int exception1 = 10 / 0;
            System.out.println(exception1);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void exception2() {
        // exception 2
        int exception2 = Integer.MAX_VALUE + 1;
    }

    public static void exception3() {
        // exception 3
        int[] myArray3 = new int[5];
        int exception3 = myArray3[5];
    }

    public static void exception4() {
        // exception 4
        int[] myArray4 = null;
        int exception4 = myArray4[0];
    }


    public static void exception6() {
        // exception 6
        String thisString = "Hello";
        int exception6 = Integer.parseInt(thisString);
    }

    public static void exception7() {
        // exception 7
        String exception7 = null;
        System.out.println(exception7.toUpperCase());
    }
    public static void main(String[] args) {
        try {
            exception1();
        } catch (Exception e){
            System.out.println(e.toString());
        }
        try {
            exception2();
        } catch (Exception e){
            System.out.println(e.toString());
        }
        try {
            exception3();
        }catch (Exception e){
            System.out.println(e.toString());
        }
        try {
            exception4();
        } catch (Exception e){
            System.out.println(e.toString());
        }

        try {
            exception6();
        } catch (Exception e){
            System.out.println(e.toString());
        }
        try {
            exception7();
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
