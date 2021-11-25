import java.util.Scanner;

class Box{
    int width,height,depth,volume;
    Box()
    {
        width=0;
        height=0;
        depth=0;
    }
    Box(int width,int height,int depth)
    {
        this.depth=depth;
        this.height=height;
        this.width=width;
    }
    int calVol()
    {
        volume=depth*height*width;
        return volume;
    }
    void display()
    {
        System.out.println("The Volume of the Box is :"+calVol());
    }
}
public class Box_A_4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w,h,d;
        System.out.println("Eneter The Width of the Box is :");
        w=scanner.nextInt();
        System.out.println("Eneter The height of the Box is :");
        h=scanner.nextInt();
        System.out.println("Eneter The depth of the Box is :");
        d=scanner.nextInt();
        Box box = new Box(w,h,d);
        box.calVol();
        box.display();
    }
    
}
