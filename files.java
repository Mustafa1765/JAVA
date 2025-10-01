class StringBufferDemo {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer sb1 = new StringBuffer("Hello World");

        // Delete characters from index 0 to 5 (removes "Hello ")
        sb1.delete(0, 6);
        System.out.println(sb1); // Output: World

        // Declare and initialize sb2 properly
        StringBuffer sb2 = new StringBuffer("Hello Java");
        System.out.println(sb2); // Output: Hello Java

        // Create sb3 and delete character at index 0 (removes 'H')
        StringBuffer sb3 = new StringBuffer("Hello World");
        sb3.deleteCharAt(0);
        System.out.println(sb3); // Output: ello World
    }
}
