// Bubble Sort : Also called the exchanging sorting algo , inplace sorting algo.
//  What Is Bubble Sort?
// Bubble Sort is a comparison-based sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. This process continues until the list is sorted.
// Think of it like bubbling up the largest values to the top (end of the list), just like bubbles rising in water.

// 🔁 How It Works – Step-by-Step
// - Start at the beginning of the list
// - Compare the first two elements
// - Swap them if the first is greater than the second
// - Move to the next pair and repeat
// - After one full pass, the largest element will be at the end
// - Repeat the process for the remaining unsorted portion
// - Stop when no swaps are needed in a pass

//space-complexcity : O(1) ,, time-Complexcity : best-case = O(N) and Wrost-Case = O(N**2);
// stable : yes
import java.util.Arrays;

public class _1BubbleSort {
    public static void main(String[] args) {
        int nums[]={2,1,5,3,-12,4,7,9,0,10,8,6,-1};
        System.out.println(Arrays.toString(bubble(nums))); // we have using the Arrays.toString function to convert the array into string and provide the complete array element a one time whithout any loop; if we not use it ,then try to use of loop to print the arr element return from the sort method

    }

    static int[] bubble(int[] arr){
        //run the steps n-1 times
        for(int i=0;i<arr.length;i++){
            //passes for the jth looop will be from 1 to the arr.length-i
            for(int j=1;j<arr.length-i;j++){
                //perform swapping if the previous element is greater the the current one
                if(arr[j]<arr[j-1]){
                    //swapp
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }

        return arr;
    }
}
