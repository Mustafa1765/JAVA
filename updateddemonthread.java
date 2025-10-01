class DaemonThreadExample extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread is running...");
        } else {
            System.out.println("User thread is running...");
        }

        // Work simulation
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(500); // pause for half a second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        DaemonThreadExample t1 = new DaemonThreadExample(); // user thread
        DaemonThreadExample t2 = new DaemonThreadExample(); // daemon thread

        // Set t2 as daemon before starting
        t2.setDaemon(true);

        // Start both threads
        t1.start();
        t2.start();
    }
}
