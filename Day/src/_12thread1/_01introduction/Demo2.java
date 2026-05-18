package _12thread1._01introduction;

/*
假如我要实现如下功能
程序不停地在屏幕上输出一句问候的语句(比如“你好”)
“同时”，当我通过键盘输入固定输入的时候，程序停止向屏幕输出问候的语句(比如说输入gun)

多线程改进
 */

import java.sql.Time;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Demo2 {
    public static boolean flag = true;
    public static void main(String[] args) {

        System.out.println("say hello before");
        sayHello();
        System.out.println("say hello after");

        System.out.println("wait before");
        waitToStop();
        System.out.println("wait after");


    }

    public static void sayHello() {
        new Thread(new Runnable() {
            public void run() {
                while(flag){
                    System.out.println("hello");
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();

    }

    public static void waitToStop() {
        new Thread(new Runnable() {
            public void run() {
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
                while(flag){
                    System.out.println("hello");
                   if("gun".equals(s)){
                       flag = false;
                       break;
                   }
                }
            }
        }).start();
    }
}
