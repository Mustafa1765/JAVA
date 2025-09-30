public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};  // Sample array

        System.out.println("Before Sorting:");
        printArray(arr);

        bubbleSort(arr); // Call bubble sort

        System.out.println("\nAfter Sorting:");
        printArray(arr);
    }

    // Bubble Sort Method
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // After each pass, largest element goes to the end
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Utility function to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
