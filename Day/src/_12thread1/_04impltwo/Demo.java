package _12thread1._04impltwo;

/*
多线程的实现方式二:实现Runnable接口
1.定义一个类实现Runnable接口
2.重写run方法
3.创建子类对象
4.创建线程对象(Thread对象),把实现了Runnable接口的子类对象作为参数传递
5.start方法启动线程
 */
public class Demo {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        new Thread(myRunnable).start();
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("子线程执行了");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() +
                    "------" + i);
        }
    }
}