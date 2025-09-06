package LabJava.lab4;

// 4)Create two threads performing the same task. Assign different priorities to them. Run the threads multiple times and try to observe how priority influences execution.
public class q4 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i+".Thread with priority "+Thread.currentThread().getPriority()+" is running");
            // System.out.print(i+" | ");
        }
    }
    public static void main(String[] args) {
        q4 t1=new q4();
        q4 t2=new q4();

        t1.setPriority(2);
        t2.setPriority(7);

        t1.start();
        t2.start();
    }
}
