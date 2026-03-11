package dataType;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        //计算三个数的最大值和最小值
        //基于三目运算符实现
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入变量 a 的值: ");
        int a = sc.nextInt();

        System.out.print("请输入变量 b 的值: ");
        int b = sc.nextInt();

        System.out.print("请输入变量 c 的值: ");
        int c = sc.nextInt();

        int max = a;
        max = (max > b) ? max : b;
        max = (max > c) ? max : c;

        int min = a;
        min = (min < b) ? min : b;
        min = (min < c) ? min : c;

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
