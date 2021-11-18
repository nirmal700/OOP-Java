class Student
{
    String name;
    int roll_no;
    Student(String name,int roll_no)
    {
        this.name=name;
        this.roll_no=roll_no;
    }
    void show()
    {
        System.out.println("The Name of the student is :"+name);
        System.out.println("The Roll No. of the student is :"+roll_no);
    }

}
public class Student_Object 
{
    public static void main(String[] args) 
    {
        Student student =new Student("John", 20);
        student.show();
    }
    
}
