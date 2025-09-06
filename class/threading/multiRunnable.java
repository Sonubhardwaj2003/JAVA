package threading;
// class A implements Runnable{
//     public void run(){
//         System.out.println("Thread A");
//     }
// }

// class B implements Runnable{
//     public void run(){
//         System.out.println("Thread B");
//     }
// }

// public class multiRunnable{
//     public static void main(String[] args) {
//         A a=new A();
//         B b=new B();

//         Thread t1=new Thread(a);
//         Thread t2=new Thread(b);

//         t1.start();
//         t2.start();
        
//     }
// }



// class A extends Thread{
//     public void run(){
//         int i;
//         for(i=0;i<10;i++){
//             System.out.println(i+1 + " Thread A");
//         }
//     }
// }
// class B extends Thread{
//     public void run(){
//         int i;
//         for(i=0;i<10;i++){
//             System.out.println(i+1 + " Thread B");
//         }
//     }
// }
// public class multiRunnable{
//     public static void main(String[] args) {
//         A a=new A();
//         B b=new B();

//         a.start();
//         b.start();
//     }
// }





public class multiRunnable extends Thread{
    public void run(){
        System.out.println("Thread Running.....");
    }
    public static void main(String[] args) {
        multiRunnable t1=new multiRunnable();
        multiRunnable t2=new multiRunnable();
        t1.start();

        System.out.println("t1 thread priority : "+t1.getPriority());
        System.out.println("t2 thread priority : "+t2.getPriority());

        t1.setPriority(3);
        System.out.println("t1 thread priority : "+t1.getPriority());

    }
}