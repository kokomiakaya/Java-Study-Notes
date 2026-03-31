package _09exception._02handle._05define;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        try {
            func();
        } catch (MyException e) {
            System.out.println(e.toString());
        }
    }

    public static void func()  throws MyException {
        System.out.println("请输入一个分数:");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if(score < 0 || score > 100) {
            throw new MyException("分数输入错误");
        }
    }

}

// 编译时异常
class MyException extends Exception {

    public MyException() {

    }
    public MyException(String message) {
        super(message);
    }

}

// 自定义运行时异常