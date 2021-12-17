import java.util.Scanner;

/**
 * Employee_Manager_5
 */
class Employee
{
    String empName, empID ;
    double empSal;
    Employee()
    {
        empID="";
        empName="";
        empSal=0.00;
    }
    Employee(String empName,String empID,Double empSal)
    {
        this.empID=empID;
        this.empName=empName;
        this.empSal=empSal;
    }
    void GetInfo()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Name of the Employee");
        empName=scanner.nextLine();
        System.out.println("Enter the Employee ID of the Employee");
        empID=scanner.nextLine();
        System.out.println("Enter the Salary of the Employee");
        empSal=scanner.nextDouble();
    }
    void PrintInfo()
    {
        System.out.println("The Name of the Employee is :"+empName);
        System.out.println("The Employee ID of the Employee is :"+empID);
        System.out.println("The Salary of the Employee is :"+empSal);
    }
}
class Manager extends Employee
{
    double bonus;
    Manager()
    {
        bonus=0.00;
    }
    Manager(double bonus)
    {
        this.bonus=bonus;
    }
    void ManGetInfo()
    {
        super.GetInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Bonus of the Employee");
        bonus=scanner.nextDouble();
    }
    void PrintMan()
    {
        super.PrintInfo();
        System.out.println("The Bonus of the Employee is :"+bonus);
    }
}
public class Employee_Manager_5 {
public static void main(String[] args) {
    Manager manager = new Manager();
    manager.ManGetInfo();
    manager.PrintMan();
    
    }
}