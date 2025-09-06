package LabJava.lab3;

// //1) Write a program with three methods: method1(), method2(), main(). Raise an exception in method1() and propagate it using throws to the main method.
// public class lab3 {
//     public void meth1() throws Exception{
//         System.out.println("inside meth1");
//         throw new Exception("Exception throws in meth1");
//     }

//     public void meth2(){
//         System.out.println("inside meth2");
//         try {
//             meth1();
//         } catch (Exception e) {
//             System.out.println("Eception : "+e.getMessage());
//         }
//     }
//     public static void main(String[] args) {
//         lab3 l=new lab3();

//         System.err.println("inside meth3");
//         try {
//             l.meth2();
//         } catch (Exception e) {
//             System.out.println("Exception : "+e.getMessage());
//         }

//     }
// }



// // 2)Create interfaces Flyable and Swimmable with one method each. Create a class Duck that implements both interfaces.
// interface Flyable{
//     public void fly();
// }
// interface Swimmable{
//     public void swim();
// }
// class Duck implements Flyable,Swimmable{
//     public void fly(){
//         System.out.println("Duck can fly");
//     }
//     public void swim(){
//         System.out.println("Duck can swim");
//     }
// }

// public class lab3 {
//     public static void main(String[] args) {
//         Duck d=new Duck();
//         d.fly();
//         d.swim();
//     }
// }



// .3)Create an interface Vehicle, and an abstract class Engine that implements Vehicle. Extend it in classes like Car and Truck.
interface Vehicle {
    abstract void speed();
}
abstract class Engine implements Vehicle{
    abstract void colour();
}

class car extends Engine{
    public void speed(){
        System.out.println("Speed of car is : 50 Km/h");
    }
    public void colour(){
        System.out.println("Colour of car is : Red");
    }
}

class truck extends Engine{
    public void speed(){
        System.out.println("Speed of truck is : 20 Km/h");
    }
    public void colour(){
        System.out.println("Colour of car is : Black");
    }
}
public class lab3 {
    public static void main(String[] args) {
        car c=new car();
        c.speed();
        c.colour();

        truck t=new truck();
        t.speed();
        t.colour();
    }
}



// // .4)Write a program with nested try-catch blocks to handle file not found (FileNotFoundException) and reading errors (IOException).
// public class lab3 {
//     public static void main(String[] args) {
        
//     }
// }
