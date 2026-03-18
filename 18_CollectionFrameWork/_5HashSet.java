import java.util.*;

public class _5HashSet {

    // Custom comparator method (ascending)
    public static int compare(int x, int y) {
        return Integer.compare(x, y);
    }

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(5);
        hs.add(20);
        hs.add(30);

        System.out.println("Original HashSet: " + hs);

        // Convert HashSet to List
        List<Integer> list = new ArrayList<>(hs);

        // Sort using Comparator (ascending)
        list.sort((a, b) -> compare(a, b));
        System.out.println("Sorted Ascending: " + list);

        // Sort using Comparator (descending)
        list.sort((a, b) -> compare(b, a));
        System.out.println("Sorted Descending: " + list);

        // Another HashSet
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(10);
        hs1.add(5);
        hs1.add(20);

        // Find common elements
        int arr[] = new int[10];
        int i = 0; // move outside loop

        for (var x : hs) {
            if (hs1.contains(x)) {
                arr[i] = x;
                i++;
            }
        }

        System.out.println("Common elements:");
        for (int j = 0; j < i; j++) {
            System.out.println(arr[j]);
        }
    }
}