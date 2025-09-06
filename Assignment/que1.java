// //  Create a class Student with fields name, rollNo, and marks. Use constructor to initialize them and a method to display the details.

class student{
    public String name;
    public String roll;
    public int marks;

    public student(String n,String r,int m){
        this.name=n;
        this.roll=r;
        this.marks=m;
    }

    public void display(){
        System.out.println("Name :"+name);
        System.out.println("Roll :"+roll);
        System.out.println("Marks :"+marks);
    }
}

public class que1 {
    public static void main(String[] args) {
        student s=new student("Sonu", "252", 95);
        s.display();
    }
}
