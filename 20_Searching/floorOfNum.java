public class floorOfNum {
    public static void main(String[] args) {
        int arr[]={1,2,5,12,23,29,33,45,50};
        int target=-1;
        System.out.println(FloorOfnum(arr, target));
    }

    //floor of a number refers to the gretest number which is sammler or equal to the given number or target

    static int FloorOfnum(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        
        if(target<arr[0]){
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

        // return arr[end];   //return value
        return end;    // return index
    }
}
