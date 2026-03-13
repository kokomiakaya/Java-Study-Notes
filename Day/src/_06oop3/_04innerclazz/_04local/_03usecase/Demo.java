package _06oop3._04innerclazz._04local._03usecase;

/*
局部内部类经常使用在以下两个场景中：

1. 方法需要返回一个对象，返回值类型是引用数据类型时。
   方法需要返回一个对象时，可以在方法的局部位置写一个 局部内部类
   继承/实现外部的类/接口，创建对象后作为返回值。
   这是因为方法的返回值可以是返回值类型的对象，也可以是子类对象
   （当返回值类型是引用数据类型时）。

2. 方法需要传入一个对象，形参数据类型是引用数据类型时。
   方法需要传入一个对象实参时，可以在调用方法的位置定义一个 局部内部类
   来继承/实现外部的类/接口，创建对象后作为方法的实参传入。
   这是因为方法的实参可以是形参类型的对象，也可以子类对象
   （当返回值类型是引用数据类型时）。

使用局部内部类的优点：

1. 绝对对外界隐藏，封装。
2. 相比较于传统的定义类，然后创建对象，它相对更加简洁省事。
缺点：
1. 这个类是一次性的。
综上，假如在局部位置需要一次性的使用某个对象，可以使用局部内部类创建它，
但是如果多次在不同的方法中使用，使用局部内部类就得不偿失了。
 */

public class Demo {
    public static void main(String[] args) {
        // 方法需要传入一个对象
        // 传入局部对象
        class Son4 extends Father {

        }
        m3(new Son4());
        // 常规做法
        // 传入父类对象
        m3(new Father());
        // 传入子类对象
        m3(new Son());

    }

    public static Father m(){
//        return new Father();
//        return new Son();
        class Son2 extends Father{

        }
        return new Son2();
    }

    public static IA m2(){
        class Son3 implements IA{

        }
        return new Son3();
    }

    public static void m3(Father f){

    }
}

class Father  {

}

class Son extends Father {

}

interface IA{

}

class A implements IA{

}