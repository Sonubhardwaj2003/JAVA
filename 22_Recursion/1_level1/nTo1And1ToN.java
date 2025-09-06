
public class nTo1And1ToN {
    public static void main(String[] args) {
        // num(5);
        numRev(5);
    }

    static void num(int n){
        if(n==0) return;
        System.out.println(n); //5 4 3 2 1
        num(n-1); //5 4 3 2 1
    }

    static void numRev(int n){
        if(n==0) return;
        numRev(n-1); //5 4 3 2 1
        System.out.println(n); // 1 2 3 4 5
    } 
}
