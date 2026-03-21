package _08string._01introduciton;

public class Demo {
    public static void main(String[] args) {
        // 构造方法
        // 1.空字符串
        String s1 = new String();
        System.out.println("s1 = " + s1);

        // 2.利用字节数组
        byte[] bytes = new byte[]{97,98,99,100,110};
        String s2 = new String(bytes);
        System.out.println("s2 = " + s2);

        // 3.利用字节数组的一部分，创建字符序列，从byte数组的offset开始的length个字节值
        String s3 = new String(bytes,1,3);
        System.out.println("s3 = " + s3);

        // 4.使用字符数组
        char[] charArray = new char[]{'a','b','c','d','e','f'};
        String ss = new String(charArray);
        System.out.println("ss = " + ss);

        // 5.利用字符数组的一部分，同字节数组
        String ss2 = new String(charArray,2,4);
        System.out.println("ss2 = " + ss2);

        //pubic String(String original)
        String ss3 = new String("abc");
        System.out.println("ss3 = " + ss3);
    }
}
