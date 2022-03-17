class Triangle
{
    int side1,side2,side3,peri;
    double area;
    Triangle()
    {
        side1=0;
        side2=0;
        side3=0;
        peri=0;
    }
    Triangle(int side1,int side2,int side3)
    {
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    void calArea()
    {
        double s;
        s=(side1+side2+side3)/2;
        area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    void calPerimeter()
    {
        peri=side1+side2+side3;
    }
    void display()
    {
        System.out.println("The Perimeter of the Triangke is :"+peri);
        System.out.println("The area of the Traingle is :"+area);
    }
}
 public class Traingle_A_4 {
     public static void main(String[] args) {
         Triangle triangle = new Triangle(3,4,5);
         triangle.calArea();
         triangle.calPerimeter();
         triangle.display();
     }  
}