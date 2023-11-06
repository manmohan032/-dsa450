class hn extends Thread {
    public void run()
    {
                   // Displaying the thread that is running
            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running");
       
    }

    public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            hn object
                = new hn();
            object.start();
        }
    }
}