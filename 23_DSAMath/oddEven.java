public class oddEven {
    public static void main(String[] args) {
        int n=113;
        System.out.println(isOdd(n));
    }

    static boolean isOdd(int n){
        return (n & 1 )==1;  // and of 1  with any number gives the same number.
        //if LSB provide is 1  when do & 1 with number n,then number is odd , else number is even(provide 0)
    }
}
