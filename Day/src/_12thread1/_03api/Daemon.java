package _12thread1._03api;

//当正在运行的线程都是守护线程时，Java 虚拟机退出

public class Daemon {
    public static void main(String[] args) {
        System.out.println("main start");
        DaemonThread t = new DaemonThread();

        t.setDaemon(true);
        t.start();

        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() +
                    "------" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("main end");
    }
}

class DaemonThread extends Thread {
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