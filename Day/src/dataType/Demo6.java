package dataType;

import java.lang.reflect.Type;
import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("输入一个int类型的数据: ");
        String numStr = sc.nextLine();
        //将字符串转化为
        int num = Integer.parseInt(numStr);
        System.out.println(num);
        System.out.println(numStr);

        System.out.println(((Object)num).getClass().getSimpleName());
        System.out.println(numStr.getClass().getSimpleName());

    }
}
