import java.util.*;

class QuadraticDemo {
    public static void main(String[] args) {
        int a, b, c;
        double r1, r2, D;
        Scanner s = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Given quadratic equation: ax^2 + bx + c");
        System.out.print("Enter a: ");
        a = s.nextInt();

        if (a == 0) {
            System.out.println("The value of 'a' cannot be zero in a quadratic equation.");
            return;
        }

        System.out.print("Enter b: ");
        b = s.nextInt();

        System.out.print("Enter c: ");
        c = s.nextInt();

        // Calculate discriminant
        D = b * b - 4 * a * c;

        // Check for different cases based on the discriminant value
        if (D > 0) {
            System.out.println("Roots are real and unequal.");
            r1 = (-b + Math.sqrt(D)) / (2 * a);
            r2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.printf("First root is: %.2f\n", r1);
            System.out.printf("Second root is: %.2f\n", r2);
        } else if (D == 0) {
            System.out.println("Roots are real and equal.");
            r1 = -b / (2.0 * a);
            System.out.printf("Root: %.2f\n", r1);
        } else {
            System.out.println("Roots are imaginary.");
            double realPart = -b / (2.0 * a);
            double imaginaryPart = Math.sqrt(-D) / (2 * a);
            System.out.printf("First root: %.2f + %.2fi\n", realPart, imaginaryPart);
            System.out.printf("Second root: %.2f - %.2fi\n", realPart, imaginaryPart);
        }

        s.close(); // Good practice to close the scanner
    }
}
