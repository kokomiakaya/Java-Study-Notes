package _12thread1._03api;

public class SleepDemo {
    public static void main(String[] args) {
        System.out.println("main start");
        SleepThread sd = new SleepThread();
        sd.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main end");
    }
}

class SleepThread extends Thread {
    public void run() {
    for (int i = 0; i < 10; i++) {
        System.out.println(Thread.currentThread().getName() + "------" + i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    }
}
