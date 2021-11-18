class Rectrangle
{
    int x,y,area;
    Rectrangle(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    void Area()
    {
        area=x*y;
    }
    void show()
    {
         System.out.println("The area of the Rectrangle is :"+area);
    }
}
public class Rectrangle_Area 
{
    public static void main(String[] args) 
    {
        Rectrangle rectrangle1 = new Rectrangle(4, 5);
        Rectrangle rectrangle2 = new Rectrangle(5, 8);
        rectrangle1.Area();
        rectrangle1.show();
        rectrangle2.Area();
        rectrangle2.show();
    }
}
