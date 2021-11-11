
public class Multiplication_Table 
{
    public static void main(String[] args) 
    {
        int i,j,p=0,q=0,a,b;
        int[][] arr = new int[10][10];
        for(i=1;i<=10;i++)
        {
            for(j=1;j<10;j++)
            {
                arr[p][q]=i*j;
                q++;
            }
            p++;
            q=0;
        }
        for (a = 0; a < 10; a++) 
        {
            for (b = 0; b < 10; b++) 
            {
                System.out.print(arr[a][b]+"\t");
            }
            System.out.println("");
        }
    }
    
}
