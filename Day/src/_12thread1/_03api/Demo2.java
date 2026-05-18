package _12thread1._03api;

public class Demo2 {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("thread.getName() = " + thread.getName());
        MyThread2 t1 = new MyThread2("张三");
        MyThread2 t2 = new MyThread2("李四");

        t1.start();
        t2.start();

    }
}
class MyThread2 extends Thread {
    public MyThread2(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "------" + i);
        }
    }
}