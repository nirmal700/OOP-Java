import java.util.Scanner;

class Student
{
    String name;
    int p1,p2,p3,roll,tot;
    String sex;
    void getInfo()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Name of the Student:");
        name=scanner.nextLine();
        System.out.println("Enter The Mark1 of the Student:");
        p1=scanner.nextInt();
        System.out.println("Enter The Mark2 of the Student:");
        p2=scanner.nextInt();
        System.out.println("Enter The Mark3 of the Student:");
        p3=scanner.nextInt();
        System.out.println("Enter The Roll No. of the Student:");
        roll=scanner.nextInt();
        System.out.println("Enter The Sex of the Student: i.e. M for Male or F for Female");
        sex=scanner.next();
    }
    void calMark()
    {
        tot=p1+p2+p3;
    }
    void ShowDetails()
    {
        System.out.println("The Name of the Student is :"+name);
        System.out.println("The Marks of the Student is :"+tot);
        System.out.println("The Roll No  of the Student is :"+roll);
        System.out.println("The SEX of the Student is :"+ sex);
    }
}
public class Student_ 
{
    public static void main(String[] args) 
    {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        student1.getInfo();
        student1.calMark();
        student2.getInfo();
        student2.calMark();        
        student3.getInfo();
        student3.calMark();        
        student4.getInfo();
        student4.calMark();
        student5.getInfo();
        student5.calMark();
        student1.ShowDetails();
        student2.ShowDetails();
        student3.ShowDetails();
        student4.ShowDetails();
        student5.ShowDetails();
    }
}
