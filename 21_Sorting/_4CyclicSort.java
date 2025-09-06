//Cyclic Sort : use when give the range of element in the array is from 1 to n(length of array)
// What Is Cyclic Sort?
// Cyclic Sort is a linear-time, in-place sorting algorithm designed specifically for arrays containing numbers from 1 to n, with no duplicates. It places each number directly at its correct index (i.e., value x should be at index x - 1).

// 🧠 Key Idea
// Instead of comparing and swapping adjacent elements like Bubble or Selection Sort, Cyclic Sort jumps each element to its correct position.

// 📊 Example
// Sort this list: [3, 1, 5, 4, 2]
// - Index 0: value is 3 → should be at index 2 → swap with value at index 2 → [5, 1, 3, 4, 2]
// - Index 0: value is 5 → should be at index 4 → swap → [2, 1, 3, 4, 5]
// - Index 0: value is 2 → should be at index 1 → swap → [1, 2, 3, 4, 5]
// - Now every value is at its correct index!

//Time-Complexicity : worst-case=O(N) and best-Case= O(N) 

import java.util.Arrays;

public class _4CyclicSort {
    public static void main(String[] args) {
        int nums[]={2,1,5,3,4,7,9,10,8,6}; 
        System.out.println(Arrays.toString(Cyclic(nums)));
    }
    //note : only use when range is from 0 to n (menas in a continuous manner)
    static int[] Cyclic(int[] nums){
        int i=0;
        //run the loop while i < nums.length
        while(i<nums.length){
            // first check is the value is is at the correct index , menas value at index 0th == 1(0+1) ..and so on.of yes then increase the value of index 
            if(nums[i]==i+1){ // if array contain '0' the value must be uts index,nums[i]===i;
                i++;
            }else{ 
                //if value is not at the correct index then perform the swapping of the value at ith index with the index == value-1. i.e value 5 is store at index 4 (5-1);
                int temp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }
        }

        return nums;
    }
}
