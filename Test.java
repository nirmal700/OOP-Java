import java.util.Scanner;

import btech.arithmetic.MyMath;
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.println("Enter First Number  :");
        a=scanner.nextInt();
        System.out.println("Enter Second Number  :");
        b=scanner.nextInt();
        System.out.println("Enter Your Choice  :");
        System.out.println("Enter 1 to Add two Numbers");
        System.out.println("Enter 2 to Substract");
        System.out.println("Enter 3 to Multiplication");
        System.out.println("Enter 4 to Division");
        System.out.println("Enter 5 to Mod");
        int choice;
        choice=scanner.nextInt();
        MyMath mymath = new MyMath();
        switch (choice) {
            case 1:
                mymath.Addition(a, b);
                mymath.Print();
                break;
            case 2:
                mymath.Substraction(a, b);
                mymath.Print();
                break;
            case 3:
                mymath.Multiplication(a, b);
                mymath.Print();
                break;
            case 4:
                mymath.Division(a, b);
                mymath.Print();
                break;
            case 5:
                mymath.Mod(a, b);
                mymath.Print();
                break;
        
            default:
            System.out.println("Invalid Choice");
                break;
        }

    }
}
