class A {
    int l, b;

    // Constructor for class A
    A() {
        l = 10; // Initialize l
        b = 20; // Initialize b
    }
}

class B extends A {
    int h;

    // Constructor for class B
    B() {
        super(); // Calls the superclass (A) constructor
        h = 30; // Initialize h
    }

    // Method to calculate volume
    int volume() {
        return l * b * h;
    }
}

    }
}
