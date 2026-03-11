package dataType;

import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        // 键盘录入月份的值，输出对应的季节
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入月份： ");
        String str = sc.nextLine();
        int month = Integer.parseInt(str);
        if (month >= 1 && month <= 3) {
            System.out.println("Spring");
        }else if (month >= 4 && month <= 6) {
            System.out.println("Summer");
        }else if (month >= 7 && month <= 9) {
            System.out.println("Autumn");
        }else{
            System.out.println("Winter");
        }
    }
}
