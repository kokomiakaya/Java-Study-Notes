package _06oop3._04innerclazz._05extends;

/*
实现Java多继承
1. 可以创建多个成员内部类继承外部多个类 ,然后创建内部类对象，
实际上就是外部类继承了多个类的成员
2.实现好多个接口
 */

public class Demo {
    public static void main(String[] args) {
        // 类似实现多继承
        // 但Java中实际不支持多继承，C++支持



    }
    class Inner1 extends A {

    }

    class Inner2 extends B {

    }

    class Inner3 extends C {

    }

    void func(){
        Inner1 i1 = new Inner1();
        Inner2 i2 = new Inner2();
        Inner3 i3 = new Inner3();
    }
}

interface IA {
    default void m1(){
        System.out.println("IA.m1()");
    }
}

interface IB {
    default void m2(){
        System.out.println("IB.m2()");
    }
}

interface IC {
    default void m3(){
        System.out.println("IC.m3()");
    }
}

class A {
    public void m1(){
        System.out.println("A.m1()");
    }
}

class B {
    public void m2(){
        System.out.println("B.m2()");
    }
}

class C {
    public void m3(){
        System.out.println("C.m3()");
    }
}