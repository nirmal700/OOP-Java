import java.util.Scanner;

/**
 * Area_rectrangle
 */
class Area
{
    int len,bre;
    void SetDim(int len, int bre)
    {
        this.bre=bre;
        this.len=len;
    }
    int getArea()
    {
        int area;
        area=len*bre;
        return area;
    }

}
public class Area_rectrangle 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int len , bre,ar;
        System.out.println("Enter the Length of the Rectrangle :");
        len=scanner.nextInt();
        System.out.println("Enter the Breadth of the Rectrangle :");
        bre=scanner.nextInt();
        Area area = new Area();
        area.SetDim(len, bre);
        ar = area.getArea();
        System.out.println("The Area of the Rectrangle is :"+ar);
    }
    
}