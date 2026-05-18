package _12thread1._01introduction;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Demo {
    public static  boolean flag = true;
    public static void main(String[] args) {
        System.out.println("say hello before");
        sayHello();
        System.out.println("say hello after");

        System.out.println("wait before");
        waitToStop();
        System.out.println("wait after");

    }

    public static void sayHello() {
      while(flag){
          System.out.println("hello");
          try {
              TimeUnit.SECONDS.sleep(3);
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
      }

    }

    public static void waitToStop() {
        Scanner sc = new Scanner(System.in);
        while(flag){
            String s = sc.nextLine();
            if("gun".equals(s)){
                flag = false;
                break;
            }
        }
    }

}
