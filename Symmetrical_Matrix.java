import java.util.Scanner;

public class Symmetrical_Matrix 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int[][] mat = new int[10][10];
        int[][] trans = new int[10][10];
        int a,b,flag=0;
        System.out.println("Enter the No of Rows:");
        int r=scanner.nextInt();
        System.out.println("Enter the No of Column's:");
        int c=scanner.nextInt();
        System.out.println("Enter the matrix");
        for(a=0;a<r;a++)
        {
            for(b=0;b<r;b++)
            {
                mat[r][c]=scanner.nextInt();
            }
        }
        for (a = 0; a < r; a++)
        {
            for (b = 0; b < c; b++)
            {   
                trans[a][b]=mat[b][a];
            }
        }  
        for (a = 0; a < r; a++)
        {
            for (b = 0; b < c; b++)
            {   
                if(trans[a][b]!=mat[a][b])
                {
                    flag=1;
                }
            }
        }  
        if(flag==0)
        System.out.println("The Matrix Is Symmetric");
        else
        System.out.println("The Matrix Is not Symmetric");
    }
    
}
