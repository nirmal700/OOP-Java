import java.util.Scanner;

class Employee
{
    private String empID,empName,Designation;
    Employee()
    {
        empID="";
        empName="";
        Designation="";
    }
    Employee(String empID,String empName,String Designation)
    {
        this.Designation=Designation;
        this.empID=empID;
        this.empName=empName;
    }
    void ShowDetails()
    {
        System.out.println("The Employee ID of the Employee is :"+empID);
        System.out.println("The Employee Name is  :"+empName);
        System.out.println("The Employee Designation is  :"+Designation);
    }
}
public class Employee_A_4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employee= new Employee[2];
        for(int a=0;a<2;a++)
        {
            // scanner.nextLine();
            System.out.println("Enter the Name of the Employee :");
            String empName=scanner.nextLine();
            // scanner.nextLine();
            System.out.println("Enter the Employee ID of the Employee :");
            String empId = scanner.nextLine();
            System.out.println("Enter the Designation of the Employee :");
            String Designation = scanner.nextLine();
            employee[a]= new Employee(empId,empName,Designation);
        }
        System.out.println("The Detials of the Employee are  :");
        for(int a=0;a<2;a++)
        {
            employee[a].ShowDetails();
        }
    }
    
}
