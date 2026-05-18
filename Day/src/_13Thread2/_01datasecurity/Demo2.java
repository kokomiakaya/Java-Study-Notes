package _13Thread2._01datasecurity;

import java.util.concurrent.TimeUnit;

public class Demo2 {
    public static void main(String[] args) {
        SellWindow2 obj = new SellWindow2();
        Thread t1 = new Thread(obj,"A窗口");
        Thread t2 = new Thread(obj,"B窗口");
        Thread t3 = new Thread(obj,"C窗口");

        t1.start();
        t2.start();
        t3.start();

    }
}

class SellWindow2 implements Runnable{
    int tickets = 100;

    public void run() {
        while(true){
            if(tickets > 0){
                // 模拟网络时延
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println(Thread.currentThread().getName()+
                        "卖了第"+(tickets--)+"张票");
            }
        }
    }
}
