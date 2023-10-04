public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));
        Thread thread3 = new Thread(new MyRunnable("Thread 3"));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread3.start();
    }

    static class MyRunnable implements Runnable {
        private final String threadName;

        public MyRunnable(String threadName) {
            this.threadName = threadName;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(threadName + " - Message " + (i + 1));
                try {
                    Thread.sleep(100); // Sleep for a short time to simulate work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
