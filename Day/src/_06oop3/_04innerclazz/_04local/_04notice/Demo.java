package _06oop3._04innerclazz._04local._04notice;

/*
在局部内部类的成员方法中，如果想要访问作用域内部的局部变量，那么该变量：
1.  要么直接就用final修饰，是一个局部常量。
2.  要么就是一个事实上的常量，即只能赋值一次，相当于用final修饰它。
在Java8之前版本的JDK中，如果不给能在局部内部类内部，访问的局部变量直接加上final修饰，
会编译报错。
原因?---->局部变量,和对象的生命周期冲突


局部内部类对象作为方法的返回值, 返回值类型必须是其父类型
 */

public class Demo {
    public static void main(String[] args) {
        int a = 10;
        Outer outer = new Outer();
        outer.outerMethod();
    }
}

class Outer {
    public void outerMethod() {
        int a = 1;
        final int b = 2;
        class Inner {
            void innerMethod() {
                // 不能修改局部变量的值，默认用final修饰
                //  a = 10;
                System.out.println(a);
            }
        }
    }
}