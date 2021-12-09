import java.util.Scanner;

/**
 * Area_Overloading
 */
class Area
{
    void area(int x,int y)
    {
        int res;
        res = x*y;
        System.out.println("The Area of Rectrangle is :"+res);
    }
    void area(int x)
    {
        int res;
        res=x*x;
        System.out.println("The Area of Square is :"+res);
    }
    void area(double x)
    {
        double res;
        res=3.14*x*x;
        System.out.println("The Area of Circle is :"+res);
    }
}
class CalArea
{
    CalArea(int x, int y)
    {
        int res;
        res = x*y;
        System.out.println("The Area of Rectrangle is :"+res);
    }
    CalArea(int x)
    {
        int res;
        res=x*x;
        System.out.println("The Area of Square is :"+res);
    }
    CalArea(double x)
    {
        double res;
        res=3.14*x*x;
        System.out.println("The Area of Circle is :"+res);
    }
}
 public class Area_Overloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        double d;
        System.out.println("Enter the Side1 of Rectrangle");
        a=scanner.nextInt();
        System.out.println("Enter the Side2 of Rectrangle");
        b=scanner.nextInt();
        System.out.println("Enter the Side of Square");
        c=scanner.nextInt();
        System.out.println("Enter the Radius of Circle");
        d=scanner.nextDouble();
        Area area = new Area();
        area.area(a, b);
        area.area(c);
        area.area(d);
        System.out.println("Construcutor Overloading ------------------");
        CalArea calArea = new CalArea(a, b);
        CalArea calArea2 = new CalArea(c);
        CalArea calArea3 = new CalArea(d);
    }
    
}