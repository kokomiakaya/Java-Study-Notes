package dataType;

public class Demo3 {
    public static void main(String[] args) {
        // 数据类型的转换
        // 基本数据类型的数据类型转换必须在byte、short、int、long、float、double这些数值类型和char类型之间进行
        // boolean类型不参与基本数据类型的数据类型转换。
        // 1.  byte、short、char之间不互相转换，一旦发生运算，一律自动转换为int进行运算，结果是int
        // 2.  byte、short、char任何数据类型与int进行计算，一律自动转换为int进行计算，结果是int
        // 3.  byte、short、char、int任何数据类型与long进行计算，一律自动转换为long进行计算，结果是long
        // 4.  byte、short、char、int、long任何数据类型与float进行计算，一律自动转换为float进行计算，结果是float
        // 5.  byte、short、char、int、long、float任何数据类型与double进行计算，一律自动转换为double进行计算，结果是double
        // String作为字符串类型，也可以使用" + "在表达式中参与运算，称之为"字符串的拼接"。
        // 任何表达式一旦有字符串拼接运算，那么结果必然是String类型。
        System.out.println('a'); // a
        System.out.println('a' + 1); // 98
        System.out.println("hello" + 'a' + 1); // helloa1
        System.out.println('a' + 1 + "hello"); // 98hello
        System.out.println("5 + 5 = " + 5 + 5); // 5 + 5 = 55
        System.out.println(5 + 5 + " = 5 + 5"); // 10 =  5 + 5
        System.out.println(5 + 5.0); // 10.0
        System.out.println(5 + "5" + 5.0); // 555.0


        byte b1 = 1, b2 = 2, b;
        b = (byte)(b1 + b2);
        char c = (char)(b1 + b2);
        // 一共11个1
        long d = 11111111111L;

        byte bd = 1 + 2;
        int a = 1;
        byte d2 = (byte)(a + 2);

        // 编译错误
        float f = 0.1F;
// 编译错误
//        float f2 = 0.1 + 0.2;
        float f3 = 0.1F + 0.2F;
    }
}
