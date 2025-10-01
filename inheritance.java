class A {
    // Constructor for class A
    A() {
        System.out.println("Inside A's constructor");
    }
}

class B extends A {
    // Constructor for class B
    B() {
        super(); // Calls A's constructor
        System.out.println("Inside B's constructor");
    }
}

class C extends B {
    // Constructor for class C
    C() {
       
    }
}

public class MultiDemo {
    public static void main(String[] args) {
       
    }
}
