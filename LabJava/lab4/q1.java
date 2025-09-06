// 1)Create a class MyThread that extends Thread. Override the run() method to print numbers from 1 to 5. Create and start two threads using this class
package LabJava.lab4;

class MyThread extends Thread{
    public void run(){
        for(int i=1;i<6;i++){
            System.out.println(i);
        }
    }
}

public class q1 {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();

        t1.start();;
        t2.start();
    }
}
