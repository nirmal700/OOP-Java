import java.util.Scanner;
public class Delete_Array_Position
{
    public static void main(String[] args) 
    {
        int n, pos, val;
        int a[] = new int[30];
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the position where you want to Delete element:");
        pos = s.nextInt();
        System.out.print("Enter the element you want to Delete:");
        val = s.nextInt();
        for(int i = pos ; i < n ; i++)
        {
            a[i] = a[i+1];
        }
        System.out.println("After Deleting:");
        for(int i = 0; i < n-1; i++)
        {
            System.out.println(a[i]);
        }
        System.out.print(a[n]);
    }
}