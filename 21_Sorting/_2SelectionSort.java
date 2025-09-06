//SelectionSort : What Is Selection Sort?
// Selection Sort works by repeatedly finding the minimum (or maximum) element from the unsorted part of the list and moving it to the beginning (or end). It divides the list into two parts: the sorted and the unsorted.
// Think of it like selecting the smallest card from a deck and placing it in order, one by one.

// 🛠️ How It Works – Step-by-Step
// - Start with the entire list as unsorted
// - Find the smallest element in the unsorted part
// - Swap it with the first unsorted element
// - Move the boundary of the sorted part one step forward
// - Repeat until the whole list is sorted

// Time-Complexicity : Best And Worest case : O(N**2) , Stable : No;

import java.util.Arrays;

public class _2SelectionSort {
    public static void main(String[] args) {
        int nums[]={2,1,5,3,-12,4,7,9,0,10,8,6,-1};
        System.out.println(Arrays.toString(selection(nums))); 
    }

    static int[] selection(int arr[]){
        // perform n-1 steps to  sort the algorithm
        for(int i=0;i<arr.length;i++){
            //last index change each time as the max element is at the required pasition or index in eaxch step , then not need to check the sorting with the last index ,so use  new last index at each time.
            int last=arr.length-1-i;
            
            int maxIndex = maxInd(arr,0,last);
            swap(arr, maxIndex, last);
        }

        return arr;
    }

    //Swapping the max Element with the last index element
    static void swap(int[] arr,int max,int last){
        int temp=arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
    }

    // find the index of max element
    static int maxInd(int arr[],int start,int last){
        int max=start;
        for(int i=start;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
