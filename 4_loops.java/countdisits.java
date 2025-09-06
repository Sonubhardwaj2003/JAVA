import java.util.Scanner;

public class countdisits {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in); 

        System.out.println("Enter a number");
        // number is positive and in rangr of 0 to Max_int;
        int n=sc.nextInt();
        int count=0;
        System.out.println("digits in "+n+" are :");
        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.print(count);
    }
}
