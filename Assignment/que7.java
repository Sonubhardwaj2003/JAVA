// 2)Create an abstract class Employee with a constructor that prints "Employee created". Extend it in Manager class and display the use of constructor in abstract class.
abstract class Employee{

    public Employee(){
        System.out.println("Employee Created");
    }

    abstract public void display();
}

class Manager extends Employee{
    @Override
    public void display(){
        System.out.println("class manager extends from Employee");
    }
}

public class que7 {
    public static void main(String[] args) {
        Manager m=new Manager();
        m.display();
    }
}
