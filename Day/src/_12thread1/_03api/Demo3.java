package _12thread1._03api;

/*
线程的优先级1-10
创建并启动2个线程 A  B
A线程设置最大优先级10

B线程设置最小优先级 1

每个线程打印10个数
 */

public class Demo3 {
    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3();
        MyThread3 t2 = new MyThread3();

        t1.setName("t1");
        t2.setName("t2");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}

class MyThread3 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "------" + i);
        }
    }
}