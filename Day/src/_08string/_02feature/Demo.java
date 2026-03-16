package _08string._02feature;

/*
1.请键盘录入一个任意字符串s，并用一个temp字符串引用也指向它
这个时候修改temp字符串的内容，请问s字符串的内容会随之改变吗？
 */

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        // 录入字符串
        Scanner scanner = new Scanner(System.in);
        // 用键盘接收nextLine()
        String s = scanner.nextLine();
        // 用temp指向该字符串
        String temp = s;
        // 修改temp指向的值
        temp = "abcdef";
        System.out.println("s = " + s);
        System.out.println("temp = " + temp);

        // String 重写了toString()方法，这里打印不出全限定类名
        System.out.println(s);
        System.out.println(temp);

        String s2 = "你好 张三";
        System.out.println("s2 = " + s2);
        s2 = "hello zhangsan";
        System.out.println("s2 = " + s2);


    }
}
