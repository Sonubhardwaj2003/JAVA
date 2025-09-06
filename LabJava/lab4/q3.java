package LabJava.lab4;

// 3)Create two threads, set custom names for each using setName(), and print their names using getName() inside the run() method
public class q3 extends Thread{
    public void run(){
        System.out.println(getName());
    }
    public static void main(String[] args) {
        q3 t1=new q3();
        q3 t2=new q3();

        t1.setName("Sonu Bhardwaj");
        t2.setName("Shivang Verma");

        t1.start();
        t2.start();

    }
}
