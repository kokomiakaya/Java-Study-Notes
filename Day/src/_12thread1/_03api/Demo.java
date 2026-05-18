package _12thread1._03api;

/*
获取线程名称 getName()

设置线程名称 setName(String name)
 */

public class Demo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("abc");
        t2.setName("def");

        t1.start();
        t2.start();
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "------" + i);
        }
    }
}