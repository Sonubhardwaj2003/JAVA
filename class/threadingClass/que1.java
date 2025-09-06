package threadingClass;

// //q1. print hello from thread 5 times and produce a delay of 1 sec in each print.

// public class que1 {
//     @SuppressWarnings("unused")
//     public static void main(String[] args) {
//         // my m=new my();
//         Thread m=new Thread();
//         try {
//             for(int i=0;i<5;i++){
//                 System.out.println("Hello java from Thread");
//                 Thread.sleep(1000);
//             }
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }

//     }
// }


// // q2. impliments runnable interface
// class my implements Runnable{
//     public void run(){
//         for (int i=1;i<11;i++){
//             System.out.println(i);
//         }
//     }
// }
// public class que1 {
//     @SuppressWarnings("unused")
//     public static void main(String[] args) {
//         my m=new my();
//         Thread t=new Thread(m);
//         t.start();
//     }
// }



// printing odd and even alternatively from 1 to 20.with two threads with sleep method 
class even extends Thread{
    public void run(){
        for(int i=1;i<=20;i++){
            if(i%2==0){
                System.out.println(i);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
    }
}
class odd extends Thread{
    public void run(){
        for(int i=1;i<=20;i++){
            if(i%2!=0){
                System.out.println(i);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
    }
}
public class que1 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        even e=new even();
        odd o=new odd();

        e.start();
        o.start();
    }
}
