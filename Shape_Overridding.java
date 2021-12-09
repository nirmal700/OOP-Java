/**
 * Shape_Overridding
 */
class Shape
{
    void draw()
    {
        System.out.println("Drawing Shape");
    }
    void erase()
    {
        System.out.println("Erasing Shape");
    }
}
class Triangle extends Shape
{
    void draw()
    {
        System.out.println("Drawing Triangle");
    }
    void erase()
    {
        System.out.println("Erasing Triangle");
    }
}
class Circle extends Shape
{
    void draw()
    {
        System.out.println("Drawing Circle");
    }
    void erase()
    {
        System.out.println("Erasing Circle");
    }
}
class Square extends Shape
{
    void draw()
    {
        System.out.println("Drawing Square");
    }
    void erase()
    {
        System.out.println("Erasing Square");
    }
}
 public class Shape_Overridding {
     public static void main(String[] args) {
         Shape circle = new Circle();
         circle.draw();
         circle.erase();
         Shape triangle = new Triangle();
         triangle.draw();
         triangle.erase();
         Shape square = new Square();
         square.draw();
         square.erase();
     }

    
}