import java.util.Scanner;

public class Calculator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int choice,n1,n2;
        System.out.println("Enter a Number");
        n1=scanner.nextInt();
        System.out.println("Enter a Number");
        n2=scanner.nextInt();
        System.out.println("Enter 1 to add two Numbers");
        System.out.println("Enter 2 to Substract two Numbers");
        System.out.println("Enter 3 to Multiply two Numbers");
        System.out.println("Enter 4 to Divide two Numbers");
        choice=scanner.nextInt();
        switch (choice) {
            case 1:
                int sum;
                sum=n1+n2;
                System.out.println("The Sum of the two Numbers are:"+sum);
                break;
            case 2:
                int Substract;
                Substract=n1-n2;
                System.out.println("The Substraction of the two Numbers are:"+Substract);
                break;
            case 3:
                int Multiply;
                Multiply=n1*n2;
                System.out.println("The Multiplication of the two Numbers are:"+Multiply);
                break;
            case 4:
                int Division;
                Division=n1/n2;
                System.out.println("The Division of the two Numbers are:"+Division);
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }   
    }    
}
