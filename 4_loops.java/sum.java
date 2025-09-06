import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in); 

        System.out.println("Enter a number");
        int n=sc.nextInt();
        int i,sum=0;
         
        for( i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of "+n+" is : "+sum);
    }
}
