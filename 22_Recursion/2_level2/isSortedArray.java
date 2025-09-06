public class isSortedArray {
    public static void main(String[] args) {
        int arr[]={1,3,5,6,12,7,9};
        System.out.println(isSorted(arr, 0));
    }

    static boolean isSorted(int arr[],int index){
        // base condirion
        if(index==arr.length-1) return true;

        // first check is the element at arr[i] < arr[i+1] or not ,and then call over function for next index.
        return (arr[index]<arr[index+1] && isSorted(arr,index+1));
    }
}
