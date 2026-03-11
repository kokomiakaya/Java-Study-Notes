package oop1;

public class Demo7 {
    static Cat2 cat = new Cat2();
    Dog dog = new Dog();
    Dog dog2;
    static Dog dog3;

    public static void main(String[] args) {
        System.out.println("hello world!");
        Demo7 d = new Demo7();
    }

    public Demo7() {
        System.out.println("Demo7()");
    }

}

class Cat2{
    static Dog dog = new Dog();

    public Cat2(){
        System.out.println("Cat2()");
    }
}

class Dog{
    public Dog(){
        System.out.println("Dog()");
    }
}

//1.静态成员变量的显式赋值，是在类加载过程中执行的。不管何种方式触发该类的类加载，这个过程都要执行。
//2.类加载可以连环触发，一个类可以最先开始类加载，但是不一定会最先完成类加载
//3.无论是静态成员变量还是成员变量，只有声明且没有其它任何赋值方式赋值，那就只有默认值。