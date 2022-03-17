import java.util.Scanner;
class Average
{
    int n1,n2,n3;
    float avg;
    Average(int n1,int n2,int n3)
    {
        this.n1=n1;
        this.n2=n2;
        this.n3=n3;
    }
    void calculate()
    {
        avg=(n1+n2+n3)/3;
    }
    void show()
    {
        System.out.println("The Average of "+ n1+"\t"+n2+"\t"+n3+"\t" + "Is :"+avg);
    }
}
public class Average_Three 
{
    public static void main(String[] args) 
    {
        Scanner scanner= new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Enter the No's To Find the Average :");
        n1=scanner.nextInt();
        n2=scanner.nextInt();
        n3=scanner.nextInt();
        Average average = new Average(n1, n2, n3);
        average.calculate();
        average.show();
    }
    
}