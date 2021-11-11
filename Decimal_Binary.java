import java.util.Scanner;

/**
 * Decimal_Binary
 */
public class Decimal_Binary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dn,a=0;
        int[] bn = new int[10];
        System.out.println("Enter the Decimal Number Which You Want to Convert To Binary");
        dn=scanner.nextInt();
        while(dn>0)
        {
            bn[a]=dn%2;
            dn=dn/2;
            a++;
        }
        System.out.print("The Binary Equivalent is :");
        for(int i=0;i<a;i++)
        {
            System.out.print(bn[i]);
        }
    }
}