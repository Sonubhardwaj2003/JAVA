public class cellingofnum {
    public static void main(String[] args) {
        int arr[]={1,2,5,12,23,29,33,45,50};
        int target=22;
        System.out.println(CelingOfNumbr(arr, target));
    }

    // celling of a number refers to the return the sammlest number which is greater or equal to the target

    static int CelingOfNumbr(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        
        if(target>arr[arr.length-1]){
            return -1;
        }

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                // return arr[mid];
                return mid;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

        // return arr[start];  //return value
        return start;  //returning the index
    }
}
