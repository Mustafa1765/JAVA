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
        Box B1 = new Box(5,
