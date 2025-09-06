// import java.util.Scanner;

// public class try_Catch {
//     @SuppressWarnings("resource")
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the value of first value :");
//         int a=sc.nextInt();
//         System.out.println("Enter the value of Second value :");
//         int b=sc.nextInt();
//         try {
            
//             int c=a/b;
//             System.out.println(c);
            
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
    
// }




// import java.util.Scanner;

// public class try_Catch {
//     @SuppressWarnings("resource")
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the value of first value :");
//         int a=sc.nextInt();
//         System.out.println("Enter the value of Second value :");
//         int b=sc.nextInt();
//         try {
            
//             int c=a/b;
//             System.out.println(c);
            
//         } 
//         // catch(ArithmeticException e){
//         //     System.out.println("There can be an exceotion");
//         // }
//         // catch (Exception e) {
//         //     System.out.println("u should not be divide the number with Zero :"+e);
//         // }
//         finally{
//             System.out.println("Finally block always execute");
//         }
//         System.out.println("I ma out of try-catch block");
//     }
    
// }





// public class try_Catch {
//     public static void checkNumber(int num){
//         if(num<1){
//             throw new ArithmeticException("Number is negative ,replace it by positive number");
//         }
//         else{
//             System.out.println("Square of number is :"+num*num);
//         }
//     }
//     @SuppressWarnings("static-access")
//     public static void main(String[] args) {
//         try_Catch t=new try_Catch();
//         t.checkNumber(-3);
//         System.out.println("rest of code is here");
//     }
    
// }




// import java.util.Scanner;

// public class try_Catch {
//     @SuppressWarnings("resource")
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the value of Numerator :");
//         int numerator=sc.nextInt();
//         System.out.println("Enter the value of denominator :");
//         int denominator=sc.nextInt();
//         try {
            
//             if(denominator==0){
//                 throw new ArithmeticException(" : Division is not possible");
//             }
//             int result=numerator/denominator;
//             System.out.println("Result : "+result);
            
//         } catch (ArithmeticException e) {
//             System.out.println("Exception"+e.getMessage());
//         }
//         System.out.println("System end here");
//     }
    
// }




// //1. write a programas a programer that makes the banking app,u have to imlememt the bank balance program ,using throw keyword.
// import java.util.Scanner;

// public class try_Catch {
//     @SuppressWarnings("resource")
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the value of bankBalnce :");
//         double bankBalance=sc.nextDouble();
        
//         try {

//             System.out.println("Current Bank Balance:"+bankBalance);
//             if(bankBalance<5000){
//                 throw new ArithmeticException(" : Balance must be greater than $5000 for widthraw");
//             }
            
//         }
//         catch (ArithmeticException e) {
//             System.out.println("Exception"+e.getMessage());
//         }
//         System.out.println("System end here");
//     }
    
// }


// // 2.age>14,weight>15 for regrestration of student .
// import java.util.Scanner;

// public class try_Catch {
//     @SuppressWarnings("resource")
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the age of student :");
//         int age=sc.nextInt();
//         System.out.println("Enter the weight of student:");
//         double weight=sc.nextDouble();
        
//         try {

//             if(age<14 || weight<15){
//                 throw new ArithmeticException(" : Age and weigth must be greater the 14 and 15 respectively for student registeration in Sports");
//             }
//             System.out.println("Student resgisteration done.");
            
//         }
//         catch (ArithmeticException e) {
//             System.out.println("Exception"+e.getMessage());
//         }
//         System.out.println("System end here");
//     }
    
// }



// Throws
import java.util.*;
public class try_Catch {
    public int div(int m,int n)  throws ArithmeticException{
        int divi=m/n;
        return divi;
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        try_Catch t=new try_Catch();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value a :");
        int a=sc.nextInt();
        System.out.println("Enter the value b :");
        int b=sc.nextInt();
        
        try {
 
            System.out.println(t.div(a,b));
            
        }
        catch (ArithmeticException e) {
            System.out.println("Exception"+e);
        }
        System.out.println("System end here");
    }
    
}
