package _12thread1._02implone;
/*
注意:
1.run方法跟start方法有什么区别
执行run方法只是普通方法调用,跟线程没关系,并不会开辟新的执行路径
start方法才是真正的开辟新的执行路径

2.一个线程能否启动多次?
java.lang.IllegalThreadStateException

3.谁才代表一个线程?
Thread及其子类对象才代表一个线程
 */
public class Demo3 {
    public static void main(String[] args) {
        System.out.println("main start");

        MyThread3 t1 = new MyThread3();
        MyThread3 t2 = new MyThread3();

        t1.start();
        t2.start();
//        t1.run();

//        t1.start();
        System.out.println("main end");

    }
}

class MyThread3 extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "-------" + i);
        }
    }
}