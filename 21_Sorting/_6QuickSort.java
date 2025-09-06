// ⚡ Quick Sort:   
// It's a classic divide-and-conquer algorithm known for its speed and elegance.
// Quick Sort works by selecting a pivot element and then partitioning the array so that:
// - Elements less than the pivot go to the left
// - Elements greater than the pivot go to the right
// Then it recursively applies the same logic to the left and right subarrays.

// 🧠 Step-by-Step Breakdown
// - Choose a Pivot
// - Common strategies: first element, last element, middle, or even a random one.
// - Partition the Array
// - Rearrange elements so that all smaller elements are on the left, larger on the right.
// - The pivot ends up in its correct sorted position.
// - Recursively Sort Subarrays
// - Apply Quick Sort to the left and right parts (excluding the piv

//Time Complexity : best case =O(nlogn) and worstt case=O(n^2);

import java.util.Arrays;

public class _6QuickSort {
    public static void main(String[] args) {
        int arr[]={3,2,5,1,4};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high); // Pivot index
            quickSort(arr, low, pi - 1);        // Left subarray
            quickSort(arr, pi + 1, high);       // Right subarray
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high); // Place pivot in correct position
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
