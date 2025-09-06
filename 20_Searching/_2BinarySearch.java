//BinarySearch : Binary Search, which is a much faster search algorithm than Linear Search—but with one important requirement: the data must be sorted.

// ⚡ What Is Binary Search?
// Binary Search is a divide-and-conquer algorithm that repeatedly splits the search interval in half to find a target value.

// 🧠 How It Works
// - Start with the entire sorted array.
// - Find the middle element.
// - If it matches the target, you're done.
// - If the target is smaller, search the left half.
// - If the target is larger, search the right half.
// - Repeat until the element is found or the interval is empty.

// Time complexcity : Best case =O(1)
//                    worest case=O(logN);


import java.util.Arrays;
import java.util.Scanner;

public class _2BinarySearch {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("No. of elements : ");
        int n=in.nextInt();

        System.out.println("Enter the array elements");
        int arr[]=new int[n];
        // for binary searching array mustbe sorted;
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        //if not sorted,then sort  it first
        System.out.println("Sorted array is : ");
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Eneter the taget you want to search : ");
        int target=in.nextInt();
        
        int ans=binarySearch(arr, target);
        System.out.println(ans);

        
    }

    static int binarySearch(int[] arr, int target){

        int start=0;
        int end=arr.length-1;
        
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
}
