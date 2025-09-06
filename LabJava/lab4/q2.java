package LabJava.lab4;

// .2)Create a class MyRunnable that implements Runnable. Override run() to print "Thread is running" five times. Create and run this thread using the Thread class constructor.

class MyRunnable implements Runnable{
    public void run(){
        for(int i=1;i<6;i++){
            System.out.println(i+". Thread is running...");
        }
    }
}

public class q2 {
    public static void main(String[] args) {
        MyRunnable m=new MyRunnable();
        Thread t1=new Thread(m);
        t1.start();
    }
}
