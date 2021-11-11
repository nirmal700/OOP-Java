import java.util.Scanner;

public class Array_Descending
{   
    public static void main(String[] args)
    {
        int[] no = new int[30];
        int count;
        int i, j, k;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many number's you want to input:");
        count=scanner.nextInt();
        System.out.println("Enter The Number's");
        for(int a=0;a<count;a++)
        {
            no[a]=scanner.nextInt();
        }
        for (i = 0; i < count; i++)
        {
            for (j = 0; j < count - i - 1; j++)
            {
                if (no[j] < no[j+1])
                {
                    k = no[j];
                    no[j] = no[j+1];
                    no[j+1] = k;
                }
            }
        }
        System.out.println("The Array In Descending order is:");
        for(int a=0;a<count;a++)
        {
            System.out.println(no[a]);
        }
    }
    
}
