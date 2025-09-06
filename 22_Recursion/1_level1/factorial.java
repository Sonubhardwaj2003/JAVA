// package 1_level1;

public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    static int fact(int n){
        // int fact=1;
        // for(int i=1;i<=n;i++){
        //     fact*=i;
        // }
        // return fact;


        if(n<=1) return 1; //base condition
        return n*fact(n-1); //recursive condition
    }
}
