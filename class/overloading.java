// 1.with different number of parameters.
// class my1{
//     int sum;

//     public int add(int a,int b){
//         sum=a+b;
//         return sum;
//     }

//     public int add(int a,int b,int c){
//         sum=a+b+c;
//         return sum;
//     }

// }
// public class overloading {
//     public static void main(String[] args) {
//         my1 m=new my1();

//         System.out.println(m.add(10, 20));
//         System.out.println(m.add(10, 20,30));
//     }
// }



// 2.with different datatypes.
// class my1{
//     float sum;

//     public float add(int a,int b){
//         sum=a+b;
//         return sum;
//     }

//     public float add(float a,float b){
//         sum=a+b;
//         return sum;
//     }

// }
// public class overloading {
//     public static void main(String[] args) {
//         my1 m=new my1();

//         System.out.println(m.add(10, 20));
//         System.out.println(m.add(10, 100));
//     }
// }



// // 3.with different sequence .
// class my1{
//     float sum;

//     public float add(int a,float b){
//         sum=a+b;
//         return sum;
//     }

//     public float add(float a,int b){
//         sum=a+b;
//         return sum;
//     }

// }
// public class overloading {
//     public static void main(String[] args) {
//         my1 m=new my1();

//         System.out.println(m.add(10, 20f));
//         System.out.println(m.add(10f, 100));
//     }
// }



// 4.with different sequence .
// class my1{
//     float sum;

//     public float add(int a,int b){
//         sum=a+b;
//         return sum;
//     }

//     public float sub(int a,int b){
//         sum=a+b;
//         return sum;
//     }

// }
// public class overloading {
//     public static void main(String[] args) {
//         my1 m=new my1();

//         System.out.println(m.add(10, 20));
//         System.out.println(m.sub(10, 100));
//     }
// }



class my1{
    public void show(){
        System.out.println("Method without any Peramater");
    }

    public void show(String message){
        System.out.println("Method with Peramater message"+message);
    }

    public void show(String message,int times){
        while(times>0){
            System.out.println("Method with Peramater message"+message);
            times--;
        }
    }

}
public class overloading {
    public static void main(String[] args) {
        my1 m=new my1();

        m.show();
        m.show("hello java!");
        m.show(" -I am sonu", 5);
        
    }
}