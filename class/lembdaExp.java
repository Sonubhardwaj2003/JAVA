@FunctionalInterface
interface A{
    void show();
}
public class lembdaExp {
    public static void main(String[] args) {
        // A a=new A() {
        //     public void show(){
        //         System.out.println("Hi");
        //     }
        // };

        A a=()->System.out.println("Hi");

        a.show();
    }
}
