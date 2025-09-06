// 3)Create an interface Vehicle with methods:
// void start()
// void stop()
// Create two classes Car and Bike that implement the Vehicle interface:
// The Car class should print "Car is starting" when start() is called and "Car is stopping" when stop() is called.
// The Bike class should print "Bike is starting" and "Bike is stopping" similarly.
// call the methods in the main method.
interface Vehicle{
    public void start();
    public void stop();
}
class Car implements Vehicle{
    public void start(){
        System.out.println("Car is starting ");
    }
    public void stop(){
        System.out.println("Car is stopping");
    }
}
class Bike implements Vehicle{
    public void start(){
        System.out.println("Bike is starting ");
    }
    public void stop(){
        System.out.println("Bike is stopping");
    }
}
public class que13 {
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
        c.stop();

        Bike b=new Bike();
        b.start();
        b.stop();
    }
}
