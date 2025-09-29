class BubbleDemo {
    public static void main(String[] args) {
        int n, i, j, temp;
        int[] a = new int[20];  // Declare array with size 20
        Scanner s = new Scanner(System.in);

        System.out.println("Enter total number of elements:");
        n = s.nextInt();  // Read number of elements

        System.out.println("Enter elements:");
        for (i = 0; i < n; i++) {
            a[i] = s.nextInt();  // Read each element into the array
        }

        // Bubble sort implementation
        for (i = 0; i < n - 1; i++) {  // Outer loop runs for n-1 passes
            for (j = 0; j < n - 1 - i; j++) {  // Inner loop reduces after each pass
               if (a[j] > a[j + 1]) {   // Compare adjacent elements
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;    // Swap
                }
            }
        }
        

        // Printing the sorted array
        System.out.println("The sorted elements are:");
        for (i = 0; i < n; i++) {
            System.out.print("\t" + a[i]);  // Print each sorted element
        }
    }
}
