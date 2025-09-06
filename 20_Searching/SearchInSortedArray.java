//https://leetcode.com/problems/search-in-rotated-sorted-array/....leetcode-33

public class SearchInSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,9,10,11,0,1,2}; 
        int target = 10;
        System.out.println(serach(nums, target));
    }

    static int serach(int nums[],int target){
        int pivot=pivot(nums);

        //if u dont found the pivot element
        if(pivot==-1){
            binarySearch(nums, target, 0, nums.length-1);
        }

        //if u find the pivot element
        if(nums[pivot]==target){
            return pivot;
        }
        else if(nums[0]>=target){
            return binarySearch(nums, target, pivot+1, nums.length);
        }
        else{
            return binarySearch(nums, target, 0, pivot-1);
        }
    }

    static int binarySearch(int[] arr, int target , int start , int end){

        while(start<=end){
            int mid= start + (end-start)/2;

            if(arr[mid]> target){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                return mid;
            }

        }

        return -1;
    }

    // finding the pivot element
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
