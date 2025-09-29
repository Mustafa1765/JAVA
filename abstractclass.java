// Abstract class Shape
abstract class Shape {
    abstract double area(); // Abstract method to calculate area
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    double l = 12.5, b = 2.5;

    // Implementing area method for Rectangle
    double area() {
        return l * b;
    }
}

// Triangle class extending Shape
class Triangle extends Shape {
    double b = 4.2, h = 6.5;

    // Implementing area method for Triangle
    double area() {
        return 0.5 * b * h;
    }
}

// Square class extending Shape
class Square extends Shape {
    double S = 6.5;

    // Implementing area method for Square
    double area() {
        return S * S; // Area of square is side * side
    }
}

// ShapeDemo class to test the shapes
public class ShapeDemo {  // Ensure this is the class with public static void main method


        // Printing the areas of the shapes
        System.out.println("The area of Rectangle is: " + r1.area());
        System.out.println("The area of Triangle is: " + t1.area());
        System.out.println("The area of Square is: " + s1.area());
    }
}
