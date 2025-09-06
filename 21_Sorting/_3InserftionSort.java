// InsertionSort : What Is Insertion Sort?
// Insertion Sort builds the final sorted list one item at a time. It works like sorting playing cards in your hand: you pick one card and insert it into the correct position among the already sorted cards.

// 🔁 How It Works – Step-by-Step
// - Start from the second element (index 1)
// - Compare it with elements before it
// - Shift larger elements one position to the right
// - Insert the current element into its correct position
// - Repeat for all elements

// 📊 Example
// Sort this list: [12, 11, 13, 5, 6]
// Pass 1:
// - Compare 11 with 12 → insert before → [11, 12, 13, 5, 6]
// Pass 2:
// - 13 is already in correct position → [11, 12, 13, 5, 6]
// Pass 3:
// - Compare 5 with 13, 12, 11 → insert before all → [5, 11, 12, 13, 6]
// Pass 4:
// - Compare 6 with 13, 12, 11 → insert before 11 → [5, 6, 11, 12, 13]
// Now the list is sorted!

// Time-Complexicity : worst-case=O(N**2) and best-Case= O(N) 

import java.util.Arrays;

public class _3InserftionSort {
    public static void main(String[] args) {
        int nums[]={2,1,5,3,-12,4,7,9,0,10,8,6,-1};
        System.out.println(Arrays.toString(insertion(nums))); 
    }

    static int[] insertion(int[] arr){
        //run the ith index from 0 to n-2 ,as we know that j=i+1 each time  , so if i is at last index say n-1 then j is at nth index, which is arry index out of bond exception
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    //swapping
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{  
                    break;
                }
            }
        }

        return arr;
    }
}
