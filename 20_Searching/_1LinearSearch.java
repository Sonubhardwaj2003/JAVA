//LinearSearch :  What Is Linear Search?
// Linear Search is a sequential search algorithm that checks each element in a list one by one until the desired element is found or the list ends.

// 🧠 How It Works
// - Start from the first element.
// - Compare each element with the target value.
// - If a match is found, return the index.
// - If no match is found by the end, return -1 (or indicate "not found").

// Time-Complexcity : Best case =O(1)
//                    worest case=O(N);

import java.util.Scanner;

public class _1LinearSearch {
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("No. of elements : ");
        int n=in.nextInt();
        System.out.println("Enter the array elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        System.out.println("Eneter the taget you want to search : ");
        int target=in.nextInt();
        
        int ans=linearSerach(arr, target);
        System.out.println("Is target found in the 1-D array : "+ans);


        // 2-D Array
        int arr2[][]={
            {1,2,5},
            {7,3,8,9,10},
            {22,34,55,76,4}
        };
        int target2=13;
        System.out.println("Is target found in the 2-D array : "+linearSerach(arr2, target2));
    }

    // searching in 1-D Array
    static int linearSerach(int[] nums , int target){

        if(nums.length==0){
            return -1;
        }

        for(int i=0; i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }

        return -1;
    }


    // seraching in 2-D Array
    static boolean linearSerach(int[][] nums , int target){

        if(nums.length==0){
            return false;
        }

        for(int i=0; i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){

                if(nums[i][j]==target){
                    return true;
                }
            }
        }

        return false;
    }
}
