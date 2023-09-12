package edu15;

public class Main3 {
    public class Main {
        public static void main(String[] args) throws InterruptedException {
            new Thread(() -> {
                System.out.println("Thread number one");
                new Thread(
                        () -> {
                            for (int i = 0; i < 3; i++) {
                                System.out.println("Thread number two");
                            }
                        }
                ).start();
            }).start();
            new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread number three");

                }
            }).start();


        }

    }
}
