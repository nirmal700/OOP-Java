import java.util.Scanner;

public class Reverse_Array 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[20];
        int count,b,temp;
        System.out.println("Enter how many number's you want to input:");
        count=scanner.nextInt();
        b=count-1;
        System.out.println("Enter the Number's:");
        for(int a=0;a<count;a++)
        {
            arr[a]=scanner.nextInt();
        }
        for(int a=0;a<count/2;a++)
        {
            temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            b--;
        }
        System.out.println("The Array in reverse order is :");
        for(int a=0;a<count;a++)
        {
           System.out.println(arr[a]);
        }
    }
    
}
