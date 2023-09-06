import java.util.*;
public class lesson2e2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int numone = input.nextInt();

        System.out.print("Enter the second number: ");
        int numtwo = input.nextInt();

        int add = numone+numtwo;
        int sub = numone-numtwo;
        int mul = numone*numtwo;
        float dev = (float) numone/(float) numtwo;
        int mod = numone&numtwo;
        double exp = Math.pow(numone,numtwo);

        System.out.println("when your numbers are added together you get " + add);
        System.out.println("when your numbers are subtracted from one another you get " + sub);
        System.out.println("when your numbers are multiplied together you get " + mul);
        System.out.println("when your numbers are divided  you get " + dev);
        System.out.println("the mod of your numbers is " + mod);
        System.out.println("when one is multiplied to the power of the other you get 8" + exp);


    }
}
