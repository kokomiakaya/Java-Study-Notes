package _08string._02feature._03;

public class Demo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hel" + "lo"; // 编译时直接组合
        String s4 = "Hel" + new String("lo"); // 会重新创建对象
        String s5 = new String("Hello");
        String s7 = "H";
        String s8 = "ello";
        String s9 = s7 + s8; // 重新创建对象

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // true
        System.out.println(s1 == s4); // false
        System.out.println(s1 == s9); // false
        System.out.println(s4 == s5); // false

    }
}
