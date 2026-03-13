package _06oop3._04innerclazz._02member._01basic;


public class Demo {

    int a = 300;
    private int b = 400;
    public  static String str  = "111";
    public static void main(String[] args) {
        // 外部其他类访问成员内部类
        Outer outer = new Outer();
        Outer.Inner3 inner2 =  outer.new Inner3();
        outer.normalMethod();

        // 创建成员内部类的对象
            Outer.Inner3 inner =  new Outer().new Inner3();
            inner.m2();
            // 受访问修饰符控制
//        System.out.println(inner.b);



    }
}

 /* 1.权限修饰符
        4种类权限修饰符都可以

     2.成员特点
     3.继承与实现
     4.访问特点
        内部类--->外部类
        外部类--->内部类
        内部类--->外部其他类
        外部其他类--->内部类
 */


class Outer {
    int a = 1;
    int aa = 10;

    public void normalMethod() {
        // 外部类访问内部类
        // 创建内部类访问
        Inner3 inner = new Inner3();
        // 访问内部类的普通方法
        inner.innerMethod();
        // 可以访问内部类的私有成员
        System.out.println(inner.b);
    }

    // 外部类的静态方法
    public static void staticMethod() {
           Inner3 innerOuter = new Outer().new Inner3();
           innerOuter.innerMethod();
        System.out.println(innerOuter.b);
    }


    private class Inner {

    }

    public class Inner2 {

    }

    class Inner3 {
        // 成员对象
        int a = 10;
        private int b = 100;
        // 可以定义全局常量
        public static final int num = 10;
        // 静态成员
//        static int b = 20;  成员内部类不能写静态成员

        // 成员函数
        public void m(){
            System.out.println("Inner m()");
        }

        // 静态函数
        // 成员内部类不能生命静态方法
//        public static void m2(){
//            System.out.println("Inner m2()");
//        }

        // 构造代码块
        {

        }

        // 静态代码块
        // 成员内部类不能定义静态代码块
//        static {
//
//        }

        public void m2() {
            int a = 5;
            // 访问的是局部的a
            System.out.println(a);
            // 访问的是成员内部类的a
            System.out.println(this.a);
            // 访问的是外部类的a
            System.out.println(Outer.this.a);

            // 访问外部类的成员函数
            normalMethod();
            // 访问外部类的静态函数
            staticMethod();
        }

        public void innerMethod() {
            System.out.println("Inner innerMethod()");
            Demo demo = new Demo();
            System.out.println(demo.a);
            System.out.println(demo.str);
            // 受访问权限修饰符限制
//            System.out.println(demo.b);
        }
    }

    protected class Inner4 {

    }

    // 成员内部类可以继承其他类和实现接口
    class Son extends Father implements IA {

    }
}

// 接口
interface IA {

}

class Father{

}