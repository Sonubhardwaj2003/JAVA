// 5) Create an abstract class Appliance with abstract method turnOn(). Extend it with Fan and AC, and override turnOn(). Demonstrate polymorphism by storing objects in an array and calling turnOn().
abstract class Appliance{
    abstract public void turnOn();
}

class fan extends Appliance{
    @Override
    public void turnOn(){
        System.out.println("Turn on Fan");
    }
}

class AC extends Appliance{
    @Override
    public void turnOn(){
        System.out.println("Turn on AC");
    }
}

public class que10 {
    public static void main(String[] args) {
        Appliance f=new fan();
        Appliance a=new AC();

        Appliance[] ap={f,a};

        for( Appliance x:ap){
            x.turnOn();
        }
    }
}
