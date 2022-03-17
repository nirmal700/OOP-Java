import org.shapes.*;
import java.util.Scanner;

public class LabTest_Shapes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ss;
        double r;
        double st1, st2, st3;
        System.out.println("Enter 1 to Calculate Area and Perimeter of Circle");
        System.out.println("Enter 2 to Calculate Area and Perimeter of Triangle");
        System.out.println("Enter 3 to Calculate Area and Perimeter of Square");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter radius of CIRCLE ");
                r = sc.nextDouble();
                Circle c = new Circle(r);
                System.out.println("\nThe Area and Perimeter Of the Circle :");
                System.out.println("Perimeter  : " + c.perimeter());
                System.out.println("Area : " + c.area());
                break;
            case 2:
                System.out.println("enter sides of Traingle");
                st1 = sc.nextDouble();
                st2 = sc.nextDouble();
                st3 = sc.nextDouble();
                Triangle t = new Triangle(st1, st2, st3);
                System.out.println("\nThe Area and Perimeter Of the Triangle :");
                System.out.println("Perimeter : " + t.perimeter());
                System.out.println("Area : " + t.area());
                break;
            case 3:
                System.out.println("enter side of Square");
                ss = sc.nextInt();
                Square s = new Square(ss);

                System.out.println("\nThe Area and Perimeter Of the Square : ");
                System.out.println("Perimeter : " + s.perimeter());
                System.out.println("Area : " + s.area());

            default:
                System.out.println("Invalid Choice");
                break;
        }

    }
}