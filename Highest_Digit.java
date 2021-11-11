import java.util.Scanner;

public class Highest_Digit 
{
    public static void main(String[] args) {
        int no,r,d,n=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number :");
        no=scanner.nextInt();
        d=no;
        while(no>0)
        {
            r=no%10;
            if(n<r)
            {
                n=r;
            }
            no=no/10;
        }
        System.out.println("The Greatest Digit in the Number "+d+" is "+ n);
    } 
}
