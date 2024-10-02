public class linearsearch
 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 7, 5};
        int x = 4; // Element to search for
        int index = -1; // Default value if element is not found

        // Linear search logic
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }

        // Output the result
        if (index == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("Element found at position " + index);
        }
    }
}
