package _12thread1._03api;

/*
案例:

定义一个flag标记, true 是正常状态  false中断

主线程打印3个数 打印1个 休眠1秒  中断子线程

创建子线程  打印10个数 休眠1秒

打印之前判断一下是否中断 如果正常----> 打印数据

如果发生了中断-------> 不在打印, 并且把中断信息保存到log.txt文件中

格式 年月日 时分秒  哪个线程发生了中断
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SecurityStop {
    public static void main(String[] args) {
        System.out.println("main start");
        SecurityThread t = new SecurityThread();
        t.start();

        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() +
                    "------" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        t.flag = false;

        System.out.println("main end");
    }
}

class SecurityThread extends Thread {
    boolean flag = true;
    public void run() {
        for (int i = 0; i < 10; i++) {
            if(flag)
            {
                System.out.println(Thread.currentThread().getName() +
                        "------" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            else{
                // 如果为false 发生了中断
                // 不在打印, 把中断信息保存到log.txt文件中
                // 创建SimpleDataFormat对象 指定日期格式
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                FileWriter fileWriter = null;
                try {
                    fileWriter = new FileWriter("log.txt");
                    fileWriter.write(sdf.format(new Date()) + getName() + "发生了中断！");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } finally {
                    if (fileWriter != null) {
                        try {
                            fileWriter.close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }

    }
}