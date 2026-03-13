package _06oop3._04innerclazz._03static._02classload;

/*
内部类也是类,也需要类加载, 静态内部类和外部类之间的类加载,它们会互相影响吗?

是不会的, 静态内部类和外补类之间本身没有依赖关系

它们的类加载,new对象,都是没有关系的
 */


public class Demo {
    public static void main(String[] args) {
//        Outer outer = new Outer();
        Outer.Inner inner = new Outer.Inner();
    }
}

class Outer{
    static{
        System.out.println("外部类静态代码块");
    }

    // 静态内部类
    static class Inner{
        static{
            System.out.println("内部静态代码块");
        }
    }
}
