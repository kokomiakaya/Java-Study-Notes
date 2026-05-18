package _12thread1._02implone;

import java.util.concurrent.TimeUnit;

/*
多线程的实现方式一:继承Thread
步骤:
1.定义一个类继承Thread
2.重写run方法
3.创建子类对象
4.通过start方法启动线程
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("main start");
        MyThread t = new MyThread();
        t.start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("main end");
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("子线程执行了");
    }

}