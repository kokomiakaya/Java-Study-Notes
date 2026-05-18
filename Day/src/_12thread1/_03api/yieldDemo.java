package _12thread1._03api;

public class yieldDemo {
    public static void main(String[] args) {
        new YieldThread().start();
        new YieldThread().start();

    }
}

class YieldThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            // 执行yield方法 :   暂停当前正在执行的线程对象，并执行其他线程
            Thread.yield();
            // 当前线程放弃了CPU的执行权, 但是还是能够参与下轮的CPU的竞争, 谁抢到谁执行
        }
    }

}
