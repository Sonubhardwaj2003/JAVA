// 3)Create a base class Animal with method sound() that prints "Animal sound". Override it in subclass Dog to print "Bark" and also call the parent class method using super
class Animal{
    public void sound(){
        System.out.println("Animal Sound");
    }
}

class dog extends Animal{
    @Override
    public void sound(){
        super.sound();
        System.out.println("Bark-Bark");
    }
}

public class que8 {
    public static void main(String[] args) {
        dog d=new dog();
        d.sound();
    }
}
