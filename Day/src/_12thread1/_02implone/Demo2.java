package _12thread1._02implone;

/*
多线程的实现方式一:继承Thread
步骤:
1.定义一个类继承Thread
2.重写run方法
3.创建子类对象
4.通过start方法启动线程
 */

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("main start");

        MyThread2 t1  = new MyThread2();
        MyThread2 t2  = new MyThread2();

        // 多线程的执行结果是随机的
        t1.start();
        t2.start();

        System.out.println("main end");
    }
}

class MyThread2 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "------" + i);
        }
    }
}