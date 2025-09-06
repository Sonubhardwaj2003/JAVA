//finding the position of target in an infinte array (we din not know the size of array)
// Amazone interview question
public class TargetInInfiniteArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 12, 23, 29, 33, 45, 50, 55, 57, 67, 75, 88, 92, 100, 123, 145, 179};
        int target = 33;
        System.out.println(findPosition(arr, target));
    }

    static int findPosition(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // Expand the window until target <= arr[end]
        while (end < arr.length && target > arr[end]) {
            int newStart = end + 1;
            // Double the window size
            end = end + (end - start + 1) * 2;
            // Prevent going out of bounds
            if (end >= arr.length) {
                end = arr.length - 1;
            }
            start = newStart;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
