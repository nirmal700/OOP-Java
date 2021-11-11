import java.util.Scanner;

public class Upper_Triangular {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int r,c,a,b;
        System.out.println("Enter the No.of Rows:");
        r=scanner.nextInt();
        System.out.println("Enter the No.of Column's:");
        c=scanner.nextInt();
        int[][] arr = new int[r][c];
        for (a = 0; a < r; a++)
        {
            for (b = 0; b < c; b++)
            {
                arr[a][b]=scanner.nextInt();
            }
        }
        for (a = 0; a < r; a++)
        {
            for (b = 0; b < c; b++)
            {
                if (a >= b)
                {
                    System.out.print(arr[a][b]+"\t");
                }
                else
                {
                    System.out.print("0");
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
