import java.util.Scanner;
abstract class GeometricFigure
{
    int dim1,dim2;
    abstract void getArea();
}
class Rectrangle extends GeometricFigure
{
    int res;
    Rectrangle(int dim1,int dim2)
    {
        this.dim1=dim1;
        this.dim2=dim2;
    }
    void getArea()
    {
        res=dim1*dim2;
        System.out.println("The Area of the Rectrangle is  :"+res);
    }
}
class Triangle extends GeometricFigure
{
    double res;
    Triangle(int dim1,int dim2)
    {
        this.dim1=dim1;
        this.dim2=dim2;
    }
    void getArea()
    {
        res=(double)1/2*(dim1*dim2);
        System.out.println("The Area of the Triangle is  :"+res);
    }
}
public class Geometric_Figure_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dim1,dim2;
        System.out.println("Enter the Value of Dim1 :");
        dim1=scanner.nextInt();
        System.out.println("Enter the Value of Dim2 :");
        dim2=scanner.nextInt();

        GeometricFigure geometricFigure;
        geometricFigure = new Rectrangle(dim1, dim2);
        geometricFigure.getArea();
        geometricFigure = new Triangle(dim1, dim2);
        geometricFigure.getArea();
    }
    
}
