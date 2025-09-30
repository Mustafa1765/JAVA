class Box {
    double width;
    double height;
    double depth;

    // Constructor to initialize dimensions of the box
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
        System.out.println("Volume of Box: " + Volume());
    }

    // Method to calculate volume of the box
    double Volume() {
        return width * height * depth;
    }
}

public class Volume {
    public static void main(String[] args) {
        // Creating objects of Box class with proper constructor arguments
        Box B1 = new Box(5, 6, 8); // Volume = 240
        Box B2 = new Box(3, 4, 2); // Volume = 24
        
        // Using the Volume method to print the volume of Box1 and Box2
        System.out.println("Using constructor...");
        double Vol1 = B1.Volume(); // Calculate volume of B1
        System.out.println("Volume of Box1: " + Vol1);
        
        double Vol2 = B2.Volume(); // Calculate volume of B2
        System.out.println("Volume of Box2: " + Vol2);
    }
}
