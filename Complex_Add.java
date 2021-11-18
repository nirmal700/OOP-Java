import java.util.Scanner;

class Complex
{
    int Real_Complex(int r1,int r2)
    {
        int rc =r1+r2;
        return rc;
    }
    int Imaginary_Complex(int c1,int c2)
    {
        int cc = c1+c2;
        return cc;
    }
}
public class Complex_Add 
{
    public static void main(String[] args) 
    {
        int a,b,c,d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a and b where a + ib is the first complex number.");
        a=scanner.nextInt();
        b=scanner.nextInt();
        System.out.println("Enter c and d where c + id is the second complex number.");
        c=scanner.nextInt();
        d=scanner.nextInt();
        Complex complex = new Complex();
        int ar= complex.Real_Complex(a, c);
        int ai=complex.Imaginary_Complex(b, d);
        System.out.println("The sum of the Complex No is :"+ar+" "+"i"+ai);
    }
    
}
