import java.util.Scanner;

import org.*;
/**
 * Lab
 */
public class Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to Calculate Area and Perimeter of Circle");
        System.out.println("Enter 2 to Calculate Area and Perimeter of Triangle");
        System.out.println("Enter 3 to Calculate Area and Perimeter of Square");
        //System.out.println("Enter 4 to Calculate Area and Perimeter of Circle");
        int ch = scanner.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter the Radius of the circle :");
                int r = scanner.nextInt();
                Circle circle = new Circle();
                circle.Area(r)
                break;
        
            default:
                break;
        }
    }
}