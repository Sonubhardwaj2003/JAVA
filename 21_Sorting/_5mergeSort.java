// 🧠 What Is Merge Sort?
// Merge Sort is a divide and conquer algorithm. It splits the array into halves, recursively sorts each half, and then merges the sorted halves back together.

// ⚙️ Step-by-Step Breakdown
// - Divide
// - Split the array into two halves.
// - Recursively repeat this until each sub-array has one element.
// - Conquer (Sort)
// - Since a single-element array is already sorted, start merging them back.
// - Merge
// - Combine two sorted arrays into one sorted array by comparing elements.

// 📊 Example
// Let’s sort [38, 27, 43, 3, 9, 82, 10]
// Split: [38, 27, 43, 3] and [9, 82, 10]
// → [38, 27] [43, 3] [9, 82] [10]
// → [38] [27] [43] [3] [9] [82] [10]

// Merge:
// → [27, 38] [3, 43] → [3, 27, 38, 43]
// → [9, 82] [10] → [9, 10, 82]

// Final Merge:
// → [3, 9, 10, 27, 38, 43, 82]

// 🚀 Why Use Merge Sort?
// - Time Complexity:
// - Best, Worst, Average: O(n log n)
// - Space Complexity:O(n)
// - Stable Sort: Maintains relative order of equal elements.
// - Good for Linked Lists: Doesn’t require random access.


import java.util.Arrays;

public class _5mergeSort {
    public static void main(String[] args) {
        // int arr[]={5,2,6,3,1,4};
        // arr=mergeSort(arr);
        // System.out.println(Arrays.toString(arr));

        int arr[]={5,2,6,3,1,4};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
        
    }

    //1st approach
    static int[] mergeSort(int arr[]){
        //base condition
        if(arr.length==1){
            return arr;
        }

        int mid = arr.length/2;
        //left part of array after breaking into parts
        int []left = mergeSort(Arrays.copyOfRange(arr, 0, mid)); //copyOfRange() method,copy the arr elements in the given range.
        //right part of array
        int []right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }

    static int[] merge(int first[],int second[]){
        int mixArr[]=new int[first.length+second.length];

        int i=0; //for array first
        int j=0; //for array second
        int k=0; //for array mixArr

        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mixArr[k]=first[i];
                i++;
                k++;
            }else{
                mixArr[k]=second[j];
                j++;
                k++;
            }
        }

        //if either arr first or arr second is not completely execute.
        while(i<first.length){
            mixArr[k]=first[i];
            i++;
            k++;
        }

        while(j<second.length){
            mixArr[k]=second[j];
            j++;
            k++;
        }


        return mixArr;
    }


    // 2nd approach 
    static void mergeSortInPlace(int arr[],int s,int e){
        //base condition
        if(e-s==1){
            return ;
        }

        int mid = (s+e)/2;
        //left part of array after breaking into parts
        mergeSortInPlace(arr, s, mid); 
        //right part of array
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr,s,mid,e);
    }

    static void mergeInPlace(int arr[],int s,int mid,int e){
        int mixArr[]=new int[e-s];

        int i=s; //for array first
        int j=mid; //for array second
        int k=0; //for array mixArr

        while(i<mid && j<e){
            if(arr[i]<arr[j]){
                mixArr[k]=arr[i];
                i++;
                k++;
            }else{
                mixArr[k]=arr[j];
                j++;
                k++;
            }
        }

        //if either arr first or arr second is not completely execute.
        while(i<mid){
            mixArr[k]=arr[i];
            i++;
            k++;
        }

        while(j<e){
            mixArr[k]=arr[j];
            j++;
            k++;
        }

        for(int l=0;l<mixArr.length;l++){
            arr[s+l]=mixArr[l];
        }
    }
}
