// Create a class Student with instance variables name and rollNo, and a static variable college. Assign the college name using a static block. Print the student details using a method
class Student{
    public String name;
    public String rollNo;

    static String college;

    public Student(String n,String r){
        this.name=n;
        this.rollNo=r;
    }

    static {
        college="ABES Engineerng college";
    }

    public void displayDetails(){
        System.out.println("Name : "+name);
        System.out.println("Roll number : "+rollNo);
        System.out.println("College name : "+college);
    }

}
public class que6 {
    public static void main(String[] args) {
        Student s=new Student("Sonu", "252");

        s.displayDetails();
        
    }
}
