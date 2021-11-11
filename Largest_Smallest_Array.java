import java.util.Scanner;

public class Largest_Smallest_Array
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min=0,max=0,count;
        int[] no = new int[100];
        System.out.println("Enter how many number's you want to input :");
        count=scanner.nextInt();
        System.out.println("Enter Number's :");
        for(int a=0;a<count;a++)
        {
            no[a]=scanner.nextInt();
        }
        for(int a=0;a<count;a++)
        {
            if(no[a]>max)
            {
                max=no[a];
            }
            if(a==0)
            {
                min=no[a];
            }
            if(no[a]<min)
            {
                min=no[a];
            }
        }
        System.out.println("The Largest of the inputted no is :"+max);
        System.out.println("The Smallest of the inputted no is :"+min);
    }
    
}
