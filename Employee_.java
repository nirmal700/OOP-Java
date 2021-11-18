class Employee
{
    String empName, empNo;
    float basicSal, da, hra, grossSal;
    public Employee(String Name, String eNo, float bSal)
    {
        empName=Name;
        empNo=eNo;
        basicSal=bSal;
    }
    void calGrossSal()
    {
        da=(20*basicSal)/100;
        hra=(10*basicSal)/100;
        grossSal=da+hra+basicSal;
    }
    void ShowEmpDetails()
    {
        System.out.println(""+empName+"\t"+""+empNo+"\t"+""+basicSal+"\t"+da+"\t"+""+hra+"\t"+grossSal);
    }
}

public class Employee_ 
{
    public static void main(String[] args) {
        Employee em = new Employee("Shweta Dash", "1235",   20000);
        em.calGrossSal();
        em.ShowEmpDetails();
        Employee em1 = new Employee("Nirmal Kumar", "134",   10000);
        em1.calGrossSal();
        em1.ShowEmpDetails();
    } 
}
