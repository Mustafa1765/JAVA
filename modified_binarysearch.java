import java.util.Scanner;

class BinarySearchDemo {
    public static void main(String args[]) {
        int n, num, first, last, middle;
        int[] a = new int[20];
        Scanner s = new Scanner(System.in);

        System.out.println("Enter total number of elements:");
        n = s.nextInt();

        if (n > 20) {
            System.out.println("Maximum allowed elements: 20");
            return;
        }

        System.out.println("Enter elements in sorted order:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        System.out.println("Enter the search value:");
        num = s.nextInt();

        first = 0;
        last = n - 1;
        boolean found = false;

        while (first <= last) {
            middle = (first + last) / 2;

            if (a[middle] == num) {
                System.out.println("Number found at position: " + (middle + 1));
                found = true;
                break;
            } else if (a[middle] < num) {
                first = middle + 1;
            } else {
                last = middle - 1;
            }
        }

        if (!found) {
            System.out.println("Number not found.");
        }
    }
}
