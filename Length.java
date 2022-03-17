import java.util.Scanner;

/**
 * Length
 */
public class Length {

    public static void main(String[] args) {
        String s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String ");
         s = scanner.nextLine();
        System.out.println("The Length of the String is "+s.length());
        int si  =(s.length()*3)-s.length();
        for(int a = 0 ;a < si ; a++)
        {
            s=s+s.charAt(0);
        }
        System.out.println(s);
    }
}