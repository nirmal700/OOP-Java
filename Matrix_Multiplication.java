import java.util.Scanner;

public class Matrix_Multiplication 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int[][] mat1 = new int[4][4];
        int[][] mat2 = new int[4][4];
        int[][] mul = new int[4][4];
        int a, b;
        System.out.println("Enter the First matrix");
        for (a = 0; a < 4; a++) 
        {
            for (b = 0; b < 4; b++)
            {
                mat1[a][b] = scanner.nextInt();
            }
        }
        System.out.println("Enter the Second matrix");
        for (a = 0; a < 4; a++) 
        {
            for (b = 0; b < 4; b++) 
            {
                mat2[a][b] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                for (int k = 0; k < 4; k++)
                {
                    mul[i][j] = mul[i][j] + mat1[i][k] * mat2[k][j];
                }
            }
        }
        System.out.println("The Multiplication matrix is :");
        for (a = 0; a < 4; a++) 
        {
            for (b = 0; b < 4; b++) 
            {
                System.out.print(mul[a][b]+"\t");
            }
            System.out.println("");
        }

    }
}
