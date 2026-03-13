package _06oop3._04innerclazz._04local._01introduction;

/*
局部内部类是定义在一个方法或者一个作用域里面的类，简单来说，
将局部内部类看成是局部变量即可，该类的有效范围仅在作用域内部。
（这意味着要创建它的对象，必须在作用域内部创建）

位置:局部位置
语法:class 类名{类体}

局部内部类的特点
    1.权限修饰符
        不需要了,没有意义,只在作用域内有效
    2.成员特点
        不能有静态声明
        可以有全局常量,构造方法,构造代码块
    3.继承和实现
        可以继承和实现外部的类和接口,重要的作用
 */

public class Demo {
    public static void main(String[] args) {
        // 局部内部类
        // 定义在局部位置
        class A {
            // 不能有静态申明
            // 与生命周期有关
            // 局部内部类的对象在堆上，堆上的对象靠JVM的垃圾回收机制
//            static int number = 1;
        }

    }
}

class Outer{
    public void outerNormalMethod(){

        class Inner{
            // 全局常量
            public static final int aa = 100;
            // 成员对象
            int a = 1;
            // 静态成员变量
            // 不可以创建静态成员和方法
//            static int b = 2;
//            public static void m(){
//
//            }
            // 构造代码块
            {

            }
//            static {
//
//            }

            public void normalMethod(){

            }

            // 不可以创建静态成员方法
//            public static void staticMethod(){
//
//            }

        }
    }

    public static void outerStaticMethod(){
        // 可以继承其他类和实现接口
        class Inner extends Father implements IA {

        }
    }

}


class Father{

}

interface IA{

}