package method;

//   [修饰符列表] 返回值类型 方法名 (形式参数列表){
// 方法体
// }

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum  = sumTwo(a,b);
        System.out.println("sum = " + sum);
    }

    public static int sumTwo(int a,int b){
        return a + b;
    }
}
