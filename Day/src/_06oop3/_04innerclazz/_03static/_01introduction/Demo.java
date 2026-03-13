package _06oop3._04innerclazz._03static._01introduction;

/*
静态内部类:
    位置:成员位置
    语法:在成员内部类前面+static

特点:
1.权限修饰符
    4种权限修饰符都可以
2.成员特点
    普通类有的都有
3.继承和实现
    可以继承和实现外部的类和接口
    还能继承静态内部类,成员内部类不可以

 */


public class Demo {
    int num = 10;
    private int num2 = 20;
    static String str = "111";

    public static void main(String[] args) {
        // 外部其他类访问静态内部类
        // 创建静态内部类的对象
        Outer.Inner inner = new Outer.Inner();
        System.out.println(inner.val);
        inner.innerMethod();
        inner.innerStaticMethod();
    }
}

class Outer{

    int a = 10;
    private int b = 20;
    static int c = 30;

    // 静态内部类
    // 4种权限修饰符都可以
    static class Inner{
        // 成员变量
        public int val = 1;

        // 静态成员
        public static int val2 = 2;

        // 成员方法
        public void innerMethod(){
            Outer obj = new Outer();
            // 访问外部类的成员变量，不受权限修饰符控制
            System.out.println(obj.a);
            System.out.println(obj.b);
            // 访问外部类的成员方法
            obj.normalMethod();
            // 访问外部类的静态方法
            obj.staticMethod();

        }

        public void innerMethod2(){
            // 静态内部类访问外部其他类
            // 需要创建外部其他类的对象
            // 受访问权限修饰符控制
            Demo demo = new Demo();
            System.out.println(demo.num);
            System.out.println(demo.str);
//            System.out.println(demo.num2);
        }


        // 静态成员方法
        public static void innerStaticMethod(){
            // 内部类访问外部类
            Outer obj = new Outer();
            System.out.println(obj.a);
            System.out.println(obj.b);

            obj.normalMethod();
            obj.staticMethod();
        }

        // 构造代码块
        {

        }

        // 静态代码块
        static {

        }

    }

    // 可以继承其他类，实现接口
    static class Inner2 extends Father implements IA{

    }

    // 普通成员方法
    public void normalMethod(){
        System.out.println("Outer normalMethod()");
    }

    // 静态成员方法
    public static void staticMethod(){
        System.out.println("Outer staticMethod()");
    }

}

class Father{

}

interface IA{

}