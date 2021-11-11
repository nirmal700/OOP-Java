import java.util.Scanner;

public class PerfectNumber 
{
    public static void main(String[] args) {
        int no,Sum=0,a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Range to Find Perfect Number ");
        no=scanner.nextInt();
        for(a=1;a<=no;a++)
        {
            Sum=0;
            for(b=1;b<a;b++)
            {
                if(a%b==0)
                {
                    Sum=Sum+b;
                }
            }
            if(Sum==a)
            {
                 System.out.println(Sum);
            }
        }
    }
    
}
