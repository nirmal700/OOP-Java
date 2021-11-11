import java.util.Scanner;

public class Largest_Smallest 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min=0,max=0,no,count;
        System.out.println("Enter how many number's you want to input :");
        count=scanner.nextInt();
        System.out.println("Enter Number's :");
        for(int a=0;a<count;a++)
        {
            no=scanner.nextInt();
            if(no>max)
            {
                max=no;
            }
            if(a==0)
            {
                min=no;
            }
            if(no<min)
            {
                min=no;
            }
        }
        System.out.println("The Largest of the inputted no is :"+max);
        System.out.println("The Smallest of the inputted no is :"+min);
    }
    
}
