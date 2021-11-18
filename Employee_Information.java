import java.util.Scanner;

class Employee
{
    Scanner scanner = new Scanner(System.in);
    String name,adress;
    float salary;
    int yoj;
    // Employee(String name,int yoj,float salary, String adress)
    // {
    //     this.adress=adress;
    //     this.name=name;
    //     this.salary=salary;
    //     this.yoj=yoj;
    // }
    void Show()
    {
        System.out.println("The Employee Name is :"+name);
        System.out.println("The Employee Year Of Joining is :"+yoj);
        System.out.println("The Employee Salary is :"+salary);
        System.out.println("The Employee Adress is :"+adress);
    }
    void Add()
    {
        System.out.println("Enter The Employee Name ");
        name=scanner.nextLine();
        System.out.println("Enter The Employee Year Of Joining  :");
        yoj=scanner.nextInt();
        System.out.println("Enter The Employee Salary :");
        salary=scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Enter The Employee Adress is :");
        adress=scanner.nextLine();   
    }
}
public class Employee_Information 
{
    public static void main(String[] args) 
    {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        System.out.println("Enter the Details Of the Employee 1:");
        employee1.Add();
        System.out.println("Enter the Details Of the Employee 2:");
        employee2.Add();
        System.out.println("Enter the Details Of the Employee 3:");
        employee3.Add();
        System.out.println("The Details Of the Employee's Are :");
        employee1.Show();
        employee2.Show();
        employee3.Show();
    }  
}
