package com.dipesh;

public class Pr40 {
    public static void main(String[] args) {

        Data data = new Data();

        Producer producer = new Producer(data);
        Consumer consumer = new Consumer(data);

        // creating threads
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        // starting threads
        t1.start();
        t2.start();

    }
}

class Producer implements Runnable {

    private final Data data;

    public Producer(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (data) {
                System.out.println("Producing : " + i);
                data.setValue(i);
                data.notify(); // Notify the Consumer Thread
            }
        }
    }
}

class Consumer implements Runnable {

    private final Data data;

    public Consumer(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (data) {
                System.out.println("Waiting for Data...");
                if (data.getValue() == 0) {
                    try {
                        data.wait(); // Put the Consumer Thread to Wait
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Consuming : " + data.getValue());
                data.notify(); // Notify the Producer Thread
            }
        }
    }
}

class Data {

    private int value;

    public synchronized void setValue(int value) {
        this.value = value;
    }

    public synchronized int getValue() {
        return this.value;
    }
}
