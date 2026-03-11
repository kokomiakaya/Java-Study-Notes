package dataType;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        // 键盘录入x的值，计算出y的并输出
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String numStr = sc.nextLine();
        int x = Integer.parseInt(numStr);
        int y;
        if (x >= 3){
           y =  2 * x + 1;
        }
        else if (x >= -1 && x < 3){
            y = 2 * x;
        }else {
            y = 2 * x - 1;
        }

        System.out.println("y = " + y);
    }
}
