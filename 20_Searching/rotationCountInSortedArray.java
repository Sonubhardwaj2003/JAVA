//find the number of count of rotation in the sorted array ,, geegsForgeeks
public class rotationCountInSortedArray {
    public static void main(String[] args) {
        int arr[]={12,13,15,18,20,23,27,29,37,50,55,2,3,6,10};
        System.out.println(Count(arr));
    }

    static int Count(int[] nums){
        int pivot=pivot(nums);

        if(pivot==-1) return 0;

        return pivot+1;
    }

    //finding the pivot element
    static int pivot(int arr[]){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start + (end-start)/2;

            if(end>mid && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(start<mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]>arr[start]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

        return -1;
    }
}
