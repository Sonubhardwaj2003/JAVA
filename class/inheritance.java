class Animal{
    public void eat(){
        System.out.println("Animals eat food");
    }
}

class dog extends Animal{
    public void sound1(){
        System.out.println("dogs are bark");
    }
}

class cat extends Animal{
    public void sound2(){
        System.out.println("cats sounds mau-mau");
    }
}

class goat extends cat{
    public void sound3(){
        System.out.println("goat sounds Mmmmmmmmm-mmmmmm");
    }
}

public class inheritance {
    public static void main(String[] args) {
        cat c=new cat();
        c.eat();
        c.sound2();

        dog d=new dog();
        d.eat();
        d.sound1();

        goat g=new goat();
        g.sound3();
        g.eat();
        g.sound2();
    }
}
