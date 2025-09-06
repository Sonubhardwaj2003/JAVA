// import java.lang.*;
sealed class rohan permits riya,Sonu,ram{
    public void printName(){
        System.out.println("default");
    }
}
non-sealed class riya extends rohan{
    public void printName(){
        System.out.println("Riya Sharma");
    }
}
sealed class Sonu extends rohan permits FinalSonu { 
    public void printName() { 
        System.out.println("Sonu loves Java"); 
    } 
} 

final class FinalSonu extends Sonu { 
    public void printName() { 
        System.out.println("Final Sonu here!"); 
    } 
} 

final class ram extends rohan{
    public void printName(){
        System.out.println("ram do coading");
    }
}
public class SealedClass {
    public static void main(String[] args) {
        riya o1=new riya();
        Sonu o2=new Sonu();
        ram o3=new ram();

        o1.printName();
        o2.printName();
        o3.printName();
    }
}
