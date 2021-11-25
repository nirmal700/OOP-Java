import java.util.Scanner;

class Time
{
    int hour,min,sec;
    Time()
    {
        hour=0;min=0;sec=0;
    }
    Time(int hour, int min,int sec)
    {
        this.hour=hour;
        this.min=min;
        this.sec=sec;
    }
    void Add(Time t1,Time t2)
    {
        hour=t1.hour+t2.hour;
        min=t1.min+t2.min;
        sec=t1.sec+t2.sec;
    }
    void ShowDetails()
    {
        System.out.println(""+hour+":"+min+":"+sec);
    }
}
public class Time_A_4_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour,min,sec;
        System.out.println("Enter the hour :");
        hour=scanner.nextInt();
        System.out.println("Enter the Min :");
        min=scanner.nextInt();
        System.out.println("Enter the Sec :");
        sec=scanner.nextInt();
        Time t1 =new Time(hour,min,sec);
        System.out.println("Enter the hour :");
        hour=scanner.nextInt();
        System.out.println("Enter the Min :");
        min=scanner.nextInt();
        System.out.println("Enter the Sec :");
        sec=scanner.nextInt();
        Time t2 =new Time(hour,min,sec);
        Time t3 =new Time();
        t3.Add(t1, t2);
        t3.ShowDetails();
    }
    
}
