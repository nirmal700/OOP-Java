class Parent
{
    void show()
    {
        System.out.println("This is the parent Class");
    }
}
class Child extends Parent
{
    void display()
    {
        System.out.println("This is Child Class");
    }
}
public class Print_Inheritane_5 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.show();
        Child child = new Child();
        child.display();
        child.show();
    }
    
}
