import java.util.*;
public class lesson7e1 {

    public static void showMenu(){
        System.out.println("--------");
        System.out.println("!MENU!");
        System.out.println("1. Say Hello");
        System.out.println("2. Say the date");
        System.out.println("3. tell a terrible joke");
        System.out.println("4. Exit");
    }

    public static int getoption(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your option: ");
        int optionOne = input.nextInt();

        return optionOne;
    }

    public static void optionOne(){
        System.out.println("!HELLO!");
    }

    public static void optionTwo(){
        System.out.println("11th of October 2023");
    }

    public static void optionThree(){
        System.out.println("Who does a skeleton take to a dance?");
        System.out.println("No body");
    }
    public static void main(String[] args) {
        int option = 0;
        while (option != 4){
            showMenu();
             option = getoption();
            if (option == 1){
                optionOne();
            } else if (option == 2){
                optionTwo();
            } else if (option == 3){
                optionThree();
            }



            }
        }
    }

