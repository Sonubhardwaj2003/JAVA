public class noOfDigits {
    public static void main(String[] args) {
        int n=763575746;
        int base=2; 

        int ans=(int)(Math.log(n) / Math.log(base)) +1; //count the number of digit or length of digit after conerting the number in the given base number system.

        System.out.println(ans);
    }
}
