// 1.
// class A{
//     public int n=100;
// }

// class B extends A{
//     public int n=110;
//     public void print(){
//         System.out.println(n);
//         System.out.println(super.n);
//     }
//     // public void display(){
//     //     System.out.println(super.n);
//     // }

// }

// public class SuperKeyword {
//     public static void main(String[] args) {
//         B b=new B();
//         b.print();
//         // b.display();

//     }
// }



// // 2.
// class A{
    
//     public A(){
//         System.out.println("Constructor of class A:");
//     }
// }

// class B extends A{
   
//     public B(){
//         System.out.println("Constructor of class B:");
//     }
//     public B(int num){
//         // compiler itself adds 'super keyword';
//         System.out.println("Argumenet const.of class B :"+num);
//     }
//     public void display(){
//         System.out.println("Hello!");
//     }

// }

// public class SuperKeyword {
//     public static void main(String[] args) {
        
//         B b1=new B();
//         b1.display();

//         B b2=new B(10);
//         b2.display();
//     }
// }



// 3.
class A{
    
    public void display(){
        System.out.println("Constructor of class A:");
    }
}

class B extends A{
   
    public void display(){
        System.out.println("Constructor of class B:");
    }
    
    public void print(){
        super.display();
        // super keyword callesd the parent class constructor.
        display();
       
    }

}

public class SuperKeyword {
    public static void main(String[] args) {
        
        B b1=new B();
        b1.print();
    }
}
