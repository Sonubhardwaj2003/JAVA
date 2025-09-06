
// //before java8
// import java.util.Scanner;
// public class try_with {
//     @SuppressWarnings("null")
//     public static void main(String[] args) {
//         // Scanner sc=new Scanner(System.in);
//         Scanner sc=null;
//         try {
//             sc=new Scanner(System.in);
//             System.out.println("Enter the number");
//             int num=sc.nextInt();
//             System.out.println("You Entered the number : "+num);
//         } catch (Exception e) {
//            System.out.println("Invalid Input");
//         }
//         finally{
//             if(sc!=null){
//                 sc.close(); //manually close the Scanner
//             }
//         }
//     }
// }



//after java8
import java.util.Scanner;
public class try_with {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number:");
            int num = sc.nextInt();
            System.out.println("You entered the number: " + num);
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }
}
