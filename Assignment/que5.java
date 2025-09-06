// Create a class Car with fields for brand and speed. Add a static variable totalCars and increment it each time an object is created. Display the total number of cars created using a static method.

class Car{
    public String brand;
    public double speed;
    static int totalCars=0;

    public Car(String br,double sp){
        this.speed=sp;
        this.brand=br;
        totalCars++;
    }

    public static void Display(){
        System.out.println("Total numbers of cars is :"+totalCars);
    }
}

public class que5 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Car c1=new Car("Royal Roys", 200);
        Car c2=new Car("Fortuner", 120);
        Car c3=new Car("BMW", 150);

        Car.Display();
    }
}
