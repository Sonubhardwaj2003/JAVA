
public class reverseOfNum {
    public static void main(String[] args) {
        // System.out.println(numRev(1234));

        // numRev(19901);
        // System.out.println(rev);

        System.out.println(isPalindrome(121213));

    }

    // static int rev=0;
    static int numRev(int n){
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;

        // if(n==0) return;
        
        // int rem=n%10;
        // rev=rev*10+rem;
        // numRev(n/10);
    }

    static boolean isPalindrome(int n){
        return n==numRev(n);
    }
}
