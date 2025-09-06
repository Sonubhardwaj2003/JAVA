
public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println("Sum : "+sum(12345));
        System.out.println("product : "+prod(12345));
    }

    static int sum(int n){
        // int sum=0;
        // while(n>0){
        //     sum+=n%10;
        //     n=n/10;
        // }
        // return sum;

        if(n==0) return 0;
        
        int rem=n%10;
        return rem+sum(n/10);
    }

    static int prod(int n){
        // int prod=1;
        // while(n>0){
        //     prod*=n%10;
        //     n=n/10;
        // }
        // return prod;

        if(n%10==n) return n;
        
        int rem=n%10;
        return rem*prod(n/10);
    }
}
