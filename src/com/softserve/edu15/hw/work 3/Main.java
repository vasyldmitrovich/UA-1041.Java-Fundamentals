public class Main {
    public static void main(String[] args) {
        Thread threadOne = new Thread(new MyRunnable("Thread number one"));
        Thread threadTwo = new Thread(new MyRunnable("Thread number two"));
        Thread threadThree = new Thread(new MyRunnable("Thread number three"));

        // Start threadOne
        threadOne.start();
    }

    static class MyRunnable implements Runnable {
        private final String threadName;

        public MyRunnable(String threadName) {
            this.threadName = threadName;
        }

        @Override
        public void run() {
            if (threadName.equals("Thread number one")) {
                System.out.println(threadName + " is starting Thread number two...");

                // Start threadTwo
                Thread threadTwo = new Thread(new MyRunnable("Thread number two"));
                threadTwo.start();

                try {
                    threadTwo.join(); // Wait for threadTwo to finish
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(threadName + " is finished.");
            } else if (threadName.equals("Thread number two")) {
                for (int i = 0; i < 3; i++) {
                    System.out.println(threadName);
                    try {
                        Thread.sleep(100); // Sleep for a short time
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // Start threadThree
                System.out.println(threadName + " is starting Thread number three...");
                Thread threadThree = new Thread(new MyRunnable("Thread number three"));
                threadThree.start();
            } else if (threadName.equals("Thread number three")) {
                for (int i = 0; i < 5; i++) {
                    System.out.println(threadName);
                    try {
                        Thread.sleep(100); // Sleep for a short time
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(threadName + " is finished.");
            }
        }
    }
}
