package oop2.basic._06final;

public class Demo {
    public static void main(String[] args) {
        //final有最终的、最后的意思。它是一个修饰符，可以用来修饰：
        // 1. class类
        // 2. 方法
        // 3. 变量（包括成员变量、静态成员变量和局部变量）
        //它修饰不同结构时含义是不同的，下面详细了解一下

    }
}

// final修饰类时，表示最后的类，最终的类。即表示这个类不能被继承。
// [访问权限修饰符] final class 类名{
// //类体
// }

// 这个类不能被继承
final class Father {

}

// class Mother extends Father{
//
//}