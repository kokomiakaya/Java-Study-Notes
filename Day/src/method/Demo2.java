package method;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入一个正整数: ");
//        int a = sc.nextInt();
//        System.out.println("a = " + a);
//        int ret = method(a);
//        System.out.println("The result is: " + ret);

//        System.out.print("请输入一个正整数: ");
//        int fn = sc.nextInt();
//        int res = method2(fn);

        System.out.print("请输入一个正整数: ");
        int fn = sc.nextInt();
        int res = jumpStep(fn);
        System.out.println("res = " + res);
    }

    // 使用递归计算阶乘
    public static int method(int val){
        if (val == 1){
            return 1;
        }
        return val * method(val-1);
    }

    // 使用递归需要注意的
    // 1.要有递归出口
    // 2.注意递归栈溢出

    // 计算斐波那契数列
//    F(0) = 0
//    F(1) = 1
//    F(n) = F(n - 1) + F(n - 2) (n ≥ 2)

    public static int method2(int val){
        if (val == 1){
            return 1;
        }else if (val == 2){
            return 2;
        }

        return method2(val - 1) + method2(val - 2);
    }

//    青蛙跳台阶
//    一只青蛙一次可以跳上一层台阶，也可以跳上两层，
//    求该青蛙跳上n层的台阶总共有多少种跳法（先后次序不同算不同的结果)

    public static int jumpStep(int n){
        if(n == 1) return 1;
        if(n == 2) return 2;
        return jumpStep(n-1) + jumpStep(n-2);
    }

}


