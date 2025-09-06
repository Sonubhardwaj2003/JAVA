// // final method.
class par1{
    final void demo(){
        System.out.println("This is my parent class");
    }
}
public class finMeth extends par1 {
    // final method cannot be overridden
    // void demo(){
    //     System.out.println("This is my child class");
    // }

    public static void main(String[] args) {
        finMeth f=new finMeth();
        f.demo();
    }
}



// // final class
// final class par1{
//     void demo(){
//         System.out.println("This is my parent class");
//     }
// }
// // final class cannot be inherit or extends
// public class finMeth extends par1 {
//     void demo(){
//         System.out.println("This is my child class");
//     }
//     public static void main(String[] args) {
//         finMeth f=new finMeth();
//         f.demo();
//     }
// }
