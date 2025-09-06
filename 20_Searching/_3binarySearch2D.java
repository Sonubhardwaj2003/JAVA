import java.util.Arrays;

public class _3binarySearch2D {
    public static void main(String[] args) {
        int arr[][]={
            {10,20,30,40},
            {15,25,35,45},
            {17,26,37,48},
            // {19,28,39,50}
        };

        System.out.println(Arrays.toString(binarySearch(arr, 40)));
    }

    static int[] binarySearch(int[][] arr,int target){
        int r=0;
        int c=arr[0].length-1;

        while(c>=0 && r<arr.length){

            if(arr[r][c]==target){
                return new int[]{r,c};
            }
            if(arr[r][c]<target){
                r++;
            }else{
                c--;
            }
        }

        return new int[]{-1,-1};
    }
}
