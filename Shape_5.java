class Shape
{
    void PrintShape()
    {
        System.out.println("This is This is Shape");
    }
}
class Rectrangle extends Shape
{
    void PrintRectrangle()
    {
        System.out.println("This Rectrangular Shape");
    }
}
class Circle extends Shape
{
    void PrintCircle()
    {
        System.out.println("This Circular Shape");
    }
}
class Square extends Rectrangle
{
    void PrintSquare()
    {
        System.out.println("Square is a rectangle");
    }
}
public class Shape_5 {
    public static void main(String[] args) {
        Square square = new Square();
        square.PrintShape();
        square.PrintRectrangle();
    }
    
}
