import java.util.Scanner;

class Member
{
    String Name,PhoneNumber,Adress,Age;
    Double Salary;
    Member()
    {
        Name="";
        PhoneNumber="";
        Adress="";
        Age="";
        Salary=0.00;
    }
    Member(String Name,String PhoneNumber,String Adress,String Age,Double Salary)
    {
        this.Adress=Adress;
        this.Age=Age;
        this.Name=Name;
        this.PhoneNumber=PhoneNumber;
        this.Salary=Salary;
    }
    void PrintSalary()
    {
        System.out.println("The Salary of the Employee is :"+Salary);
    }
}
class Employee extends Member
{
    String specialization;
    Employee(String Name,String PhoneNumber,String Adress,String Age,Double Salary, String specialization )  
    {
        super(Name, PhoneNumber, Adress, Age, Salary);
        this.specialization=specialization;
    } 
}
class Manager extends Member
{
    String department;
    Manager(String Name,String PhoneNumber,String Adress,String Age,Double Salary, String department )
    {
        super(Name, PhoneNumber, Adress, Age, Salary);
        this.department=department;
    }
}
public class Employee_Inheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Name,PhoneNumber,Adress,Age,specialization,department;
        Double Salary;
        System.out.println("Enter The Name of the Employee:");
        Name=scanner.nextLine();
        System.out.println("Enter The Phone No. of the Employee:");
        PhoneNumber=scanner.next();
        System.out.println("Enter The Adress of the Employee:");
        scanner.nextLine();
        Adress=scanner.nextLine();
        System.out.println("Enter The Age of the Employee:");
        Age=scanner.nextLine();
        System.out.println("Enter The Salary of the Employee:");
        Salary=scanner.nextDouble();
        System.out.println("Enter The Specialisation of the Employee:");
        scanner.nextLine();
        specialization=scanner.nextLine();
        System.out.println("Enter The Department of the Employee:");
        department=scanner.nextLine();

        Employee employee = new Employee(Name, PhoneNumber, Adress, Age, Salary, specialization);
        System.out.println("The Name of the Employee is :"+employee.Name);
        System.out.println("The Phone No. of the Employee is :"+employee.PhoneNumber);
        System.out.println("The Adress of the Employee is :"+employee.Adress);
        System.out.println("The Age of the Employee is :"+employee.Age);
        System.out.println("The Salary of the Employee is :"+employee.Salary);
        System.out.println("The Specialisation of the Employee is :"+employee.specialization);

        Manager manager = new Manager(Name, PhoneNumber, Adress, Age, Salary, department);
        System.out.println("The Name of the Employee is :"+manager.Name);
        System.out.println("The Phone No. of the Employee is :"+manager.PhoneNumber);
        System.out.println("The Adress of the Employee is :"+manager.Adress);
        System.out.println("The Age of the Employee is :"+manager.Age);
        System.out.println("The Salary of the Employee is :"+manager.Salary);
        System.out.println("The Department of the Employee is :"+manager.department);

        
        
    }
    
}
