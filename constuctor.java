class Box {
    double width;
    double height;
    double depth;

    // Constructor to initialize dimensions of the box
    Box(double W, double h, double d) {
        width = W;
        height = h;
        depth = d;
        System.out.println("Volume of Box: " + Volume());
    }

    // Method to calculate volume of the box
    double Volume() {
        return ();
    }
}

public class Volume {
    public static void main(String[] args) {
        // Creating objects of Box class
        Box B1 = new Box(); // Box with dimensions 5, 6, 8
        Box B2 = new Box(); // Box with dimensions 3, 4, 2
        
        // Using the Volume method to print the volume of Box2
        System.out.println("Using constructor...");
        double Vol1 = B1.Volume(); // Calculate volume of B1
        System.out.println("Volume of Box1: " + Vol1);
        
         // Calculate volume of B2
        System.out.println("Volume of Box2: " + Vol2);
    }
}
