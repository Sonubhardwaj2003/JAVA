import java.util.Arrays;

public class selectionSortRec {
    public static void main(String[] args) {
        int arr[] = {4, 1, 7, 3, 5, 9, 12, 15, 11, 21, 10};
        selectionSort(arr, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int arr[],int last) {
        if (last == 0) return; // base case

        // Find index of max element in range [0...last]
        int maxIndex = findMaxIndex(arr, 0, last);

        // Swap max element with element at 'last'
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;

        // Recursive call for the rest of the array
        selectionSort(arr,last - 1);
    }

    static int findMaxIndex(int[] arr, int start, int end) {
        if (start == end) return start;
        int maxIndex = findMaxIndex(arr, start + 1, end);
        return arr[start] > arr[maxIndex] ? start : maxIndex;
    }
}
