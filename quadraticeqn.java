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
        
        // Check for a = 0 to prevent division by zero
        if (a == 0) {
            System.out.println("The value of 'a' cannot be zero in a quadratic equation.");
            return;  // Exit the program if 'a' is zero
        }
        
   
        
        System.out.print("Enter c: ");
        c = s.nextInt();

        D = b * b - 4 * a * c; // Discriminant

        // Check for different cases based on the discriminant value
        if (D > 0) {
            System.out.println("Roots are real and unequal");
         
            System.out.printf("First root is: %.2f\n", r1);
            System.out.printf("Second root is: %.2f\n", r2);
        } else if (D == 0) {
            System.out.println("Roots are real and equal");
            r1 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.printf("Root: %.2f\n", r1);
        } else {
            System.out.println("Roots are imaginary");
        }
    }
}
