package LabJava.lab3;

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

class cat extends dog{
    public void sound2(){
        System.out.println("cats sounds mau-mau");
    }
}

public class herIneritance {
    public static void main(String[] args) {
        cat c=new cat();
        c.eat();
        c.sound1();
        c.sound2();
    }
}

