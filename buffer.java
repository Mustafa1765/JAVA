class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Hello World");
        sb1.delete(0, 6); // Deletes "Hello " (including the space)
        System.out.println(sb1); // Output: "World"

        // Fixed: either remove or define sb2
        // Option 1: Remove the sb2 line completely (if not needed)
        // Option 2: If you want sb2 to be same as sb1 before deletion:
        StringBuffer sb2 = new StringBuffer("Hello World");
        System.out.println(sb2); // Output: "Hello World"

        StringBuffer sb3 = new StringBuffer("Hello World");
        sb3.deleteCharAt(0); // Deletes 'H'
        System.out.println(sb3); // Output: "ello World"
    }
}
