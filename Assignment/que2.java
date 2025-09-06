// Q2)Create a class Circle with a static field PI = 3.14. Write a method to calculate the area.
class circle{
    static double pi=3.14;
    public int radius=5;

    public double area(){
        return pi*radius*radius;
    }
}
public class que2 {
    public static void main(String[] args) {
        circle c=new circle();
        
        System.out.println(c.area());
    }
}
