import java.util.Scanner;

class Rectrangle
{
    int length,breadth;
    Rectrangle()
    {
        length=0;
        breadth=0;
    }
    Rectrangle(int length,int breadth)
    {
        this.breadth=breadth;
        this.length=length;
    }
    void PrintArea()
    {
        System.out.println("The area is :"+(length*breadth));
    }
    void PrintPerimeter()
    {
        System.out.println("The Perimeter is :"+2*(length+breadth));
    }

}
class Square extends Rectrangle
{
    Square(int s)
    {
        super(s,s);
    }
}
public class Rectrangle_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length,breadth,side;
        System.out.println("Enter The Length Of The Rectrangle :");
        length=scanner.nextInt();
        System.out.println("Enter The Breadth Of The Rectrangle :");
        breadth=scanner.nextInt();
        System.out.println("Enter The Side Of The Square :");
        side=scanner.nextInt();
        Rectrangle rectrangle = new Rectrangle(length, breadth);
        rectrangle.PrintArea();
        rectrangle.PrintPerimeter();
        Square square = new Square(side);
        square.PrintArea();
        square.PrintPerimeter();
    }
    
}
