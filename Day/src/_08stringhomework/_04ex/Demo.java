package _08stringhomework._04ex;

/*
穷举匹配密码
1. 生成一个长度是3的随机数字字符串，把这个字符串作为当做密码
2. 使用穷举法生成长度是3个字符串，匹配上述生成的密码,将列举到的可能的密码打印,直到匹配成功结束.
tips:
- Random
- equals
- String 数组
 */

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        // 生成随机数字
        Random rand = new Random();
        int randomNum = rand.nextInt(1000);
        // 将随机数转为字符串
        // String.format()
        String strRandom = String.format("%03d", randomNum);
        System.out.println("生成的随机数字 = " + strRandom);
        String temp = "";
        for(int i = 0;i < 1000;i ++){
            String str = String.format("%03d",i);
            if(strRandom.equals(str)){
                System.out.println("passWord = " + str);
            }
        }
    }
}


