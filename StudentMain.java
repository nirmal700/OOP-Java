import java.util.Scanner;
import btech.Student;
public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String RollNo,Name;
        int Sub1,Sub2,Sub3;
        System.out.println("Enter the Name of the Student  :");
        Name=scanner.nextLine();
        System.out.println("Enter the Roll No. of the Student  :");
        RollNo= scanner.nextLine();
        System.out.println("Enter the Mark's In Subject 1  :");
        Sub1=scanner.nextInt();
        System.out.println("Enter the Mark's In Subject 2  :");
        Sub2=scanner.nextInt();
        System.out.println("Enter the Mark's In Subject 3  :");
        Sub3=scanner.nextInt();
        Student student = new Student(RollNo, Name, Sub1, Sub2, Sub3);
        student.Calculate();
        student.Display();
    }
}
