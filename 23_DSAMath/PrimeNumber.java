public class PrimeNumber {
    public static void main(String[] args) {
        int range=1000;

        boolean[] primes=new boolean[range+1];  // initially contains false value
        isPrime(primes, range);

        System.out.println("---------------------------------");

        for(int i=2;i<=range;i++){
            if(isPrime2(i)){
                System.out.print(i+" ");
            }
        }
    }

    static void isPrime(boolean[] primes,int range){
        for(int i=2;i*i<=range;i++){
            if(!primes[i]){ // check for if not true (if false then check)
                for(int j=i*2;j<=range;j=j+i){
                    //makes the multiple of 'i' true
                    primes[j]=true;
                }
            }
        }

        for(int i=2;i<=range;i++){
            if(!primes[i]){ // index for which value is false , print them ,they are prime numbers.
                System.out.print(i+" ");
            }
        }
    }


    static boolean isPrime2(int n){
        if(n<=1) return false;
        
        for(int j=2;j*j<=n;j++){
            if(n%j==0){
                return false;
            }
        }
        return true;
    }
}
