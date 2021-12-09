import java.util.Scanner;

interface Calculator_cal
{
    void add();
    void sub();
    void mul();
    void div();
}
class calculator implements Calculator_cal
{
    Scanner scanner = new Scanner(System.in);

    public void add()
    {
        int res,a,b;
        System.out.println("Enter a Value to Add: ");
        a=scanner.nextInt();
        System.out.println("Enter a Value to Add: ");
        b=scanner.nextInt();
        res=a+b;
        System.out.println("The Addition of Two No.'s Is :"+res);
    }
    public void sub()
    {
        int res,a,b;
        System.out.println("Enter a Value to Substract: ");
        a=scanner.nextInt();
        System.out.println("Enter a Value to Substract: ");
        b=scanner.nextInt();
        res=a-b;
        System.out.println("The Substraction of Two No.'s Is :"+res);
    }
    public void mul()
    {
        int res,a,b;
        System.out.println("Enter a Value to Multiply: ");
        a=scanner.nextInt();
        System.out.println("Enter a Value to Multiply: ");
        b=scanner.nextInt();
        res=a*b;
        System.out.println("The Multiplication of Two No.'s Is :"+res);
    }
    public void div()
    {
        double res,a,b;
        System.out.println("Enter a Value to Numerator: ");
        a=scanner.nextInt();
        System.out.println("Enter a Value to Denominator: ");
        b=scanner.nextInt();
        res=a/b;
        System.out.println("The Division of Two No.'s Is :"+res);
    }
    
}
public class Calculator_Interface {
    public static void main(String[] args) {
        Calculator_cal cal;
        cal = new calculator();
        cal.add();
        cal.div();
        cal.mul();
        cal.sub();
    }
}
