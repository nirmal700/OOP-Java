import java.util.Scanner;

public class Update_Content_Array
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[20];
        int count;
        System.out.println("Enter how many number's you want to input:");
        count=scanner.nextInt();
        System.out.println("Enter the Number's:");
        for(int a=0;a<count;a++)
        {
            arr[a]=scanner.nextInt();
        }
        System.out.println("Enter the Element Value ");
        int ev = scanner.nextInt();
        System.out.println("Enter the Element Index ");
        int ei = scanner.nextInt();
        arr[ei]=ev;
        System.out.println("The Array After Replacing the element is :");
        for(int a=0;a<count;a++)
        {
           System.out.println(arr[a]);
        }
    }
    
}
