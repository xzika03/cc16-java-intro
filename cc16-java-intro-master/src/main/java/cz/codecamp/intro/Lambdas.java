package cz.codecamp.intro;

public class Lambdas {
    public static void main(String[] args) throws InterruptedException {

        Thread[] threads = new Thread[10];

        for (int i = 0; i < threads.length; ++i) {
            final int finalI = i;
            threads[i] = new Thread(() -> System.out.println("thread #" + finalI));
            threads[i].start();
        }

        for (int i = 0; i < threads.length; ++i) {
            threads[i].join();
        }
    }
}
