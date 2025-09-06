public class findSingleNum {
    public static void main(String[] args) {
        int arr[]={1,3,6,2,3,2,1};
        System.out.println(ans(arr)); //print the number which is unique in the array.
    }

    static int ans(int [] arr){
        int unique=0;

        // Exor of 0 with something gives the same. (0^n=n)
        //And Exor of something with 1 gives complent of it.(1^n=n')
        for(int n:arr){
            unique^=n;
        }

        return unique;
    }
}
