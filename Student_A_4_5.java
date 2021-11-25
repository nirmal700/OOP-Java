import java.util.Scanner;

class Student
{
    String regNo,stdName, branch, CGPA;
    Student()
    {
        regNo="";
        stdName="";
        branch="";
        CGPA="";
    }
    Student(String regNo,String stdName,String branch,String CGPA)
    {
        this.CGPA=CGPA;
        this.branch=branch;
        this.regNo=regNo;
        this.stdName=stdName;
    }
    void ShowDetails()
    {
        System.out.println("The Student Reg. of the student is :"+regNo);
        System.out.println("The Std  Name is  :"+stdName);
        System.out.println("The Brancg of the Student is   :"+branch);
        System.out.println("The CGPA  Of the Student is  :"+CGPA);
    }
}
public class Student_A_4_5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Student[] student = new Student[2];
    for(int a=0;a<2;a++)
        {
            // scanner.nextLine();
            System.out.println("Enter the Reg. NO of the Student :");
            String regNo=scanner.nextLine();
            // scanner.nextLine();
            System.out.println("Enter the Std Name of the Student   :");
            String stdName = scanner.nextLine();
            System.out.println("Enter the Branch  of the Studenet :");
            String branch = scanner.nextLine(); 
            System.out.println("Enter the CGPA  of the Studenet :");
            String CGPA = scanner.nextLine();
            student[a]= new Student(regNo,stdName,branch,CGPA);
        }
        System.out.println("The Details of the Studnet are:");
    
       for(int a=0;a<2;a++)
       {
           student[a].ShowDetails();
       }
    }
}
