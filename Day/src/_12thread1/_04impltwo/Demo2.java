package _12thread1._04impltwo;

public class Demo2 {
    public static void main(String[] args) {
        // 方式二的两种实现方式
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName() + " is running");
            }
        },"A");
        t.start();

        new Thread(()->{
            System.out.println(Thread.currentThread().getName() + " is running");
            System.out.println(Thread.currentThread().getName() + " 2222222");
        },"B").start();

    }
}
