package _05oop2.basic._06final;

public class Demo2 {
    public static void main(String[] args) {
        // final修饰局部变量，局部变量的值无法改变
        final int num = 100;
//        num = 2;
        test(num);

    }

    // final修饰形参，传参后不能对参数进行改变
    public static void test(final int num) {
//        num = 5;
    }
}

//final修饰局部变量后，会变成一个局部常量。仍然在方法栈帧中创建存储，随着方法同生共死，除了值不能变，没有其它区别。

class Son{
    // 必须对final修饰的成员变量进行赋值，不能采用默认赋值的方式
    // 可采用 1.显式赋值 2.构造代码块赋值 3.构造器赋值
    private final int num;
    {
        num = 10;
    }

    void test(){
        // 无法对final修饰的成员变量进行修改
//        num = 1;
    }

}
