package btech.arithmetic;
public class MyMath {
    double res;
    public MyMath()
    {
        res=0;
    }
    public void Addition(int a, int b)
    {
        res=a+b;
    }
    public void Substraction(int a, int b)
    {
        res=a-b;
    }public void Multiplication(int a, int b)
    {
        res=a*b;
    }public void Division(int a, int b)
    {
        res= (double)a/b;
    }public void Mod(int a, int b)
    {
        res=(double)a%b;
    }
    public void Print()
    {
        System.out.println("The Result Of the Operation is  :"+res);
    }
}
