class A extends Thread {

    public void run() {
        // Check if the current thread is a daemon thread
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread work");
        } else {
            System.out.println("use thread work");
        }
    }
}

public class DaemonDemo {
    public static void main(String[] args) {
        // Create three instances of the A class (Thread objects)
        A t1 = new A();
     

        // Set t1 as a daemon thread
        t1.setDaemon(true);

        // Start all threads
       // Daemon thread
     ; // Normal thread
        // Normal thread
    }
}
