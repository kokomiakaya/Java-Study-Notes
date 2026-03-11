package oop3._03interface._03test;

public class Demo {
    public static void main(String[] args) {

        test();

    }

    public static IA test() {
        return new B();
    }
}

interface IA{

}

class A implements IA{

}

class B extends A{

}
