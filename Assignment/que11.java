// 1.Create two interfaces:
// Flyable with a method void fly().
// Swimmable with a method void swim().
// Create a class Duck that implements both Flyable and Swimmable interfaces. The Duck class should implement both methods fly() and swim(). Display the behavior of a duck by calling both methods.
interface Flyable{
    public void fly();
}
interface Swimmable{
    public void swim();
}
class Duck implements Flyable,Swimmable{
    public void fly(){
        System.out.println("Duck can fly");
    }
    public void swim(){
        System.out.println("Duck can swim");
    }
}
public class que11 {
    public static void main(String[] args) {
        Duck d=new Duck();
        d.fly();
        d.swim();
    }
}
