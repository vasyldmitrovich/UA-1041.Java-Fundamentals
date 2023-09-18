package com.softserve.edu15.hw;

class Hw02 {
    public static synchronized void main(String[] args) {
        var tr = new Thread(() -> main(new String[]{}));
        tr.start();
        System.out.println("Start");
        System.out.println(tr.getState());
        try {
            tr.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
