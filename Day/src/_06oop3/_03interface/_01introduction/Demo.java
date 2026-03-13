package _06oop3._03interface._01introduction;

public class Demo {
    public static void main(String[] args) {
        // 接口是一种表示对行为抽象的，不受Java多继承限制的，用来作为功能扩展标准的一种引用数据类型
        // 接口的定义：
        // [访问权限修饰符] interface 接口名称 {
        //
        // }

//   [访问权限修饰符] class 类名 extends 类名 implements 接口名 {}
        Dog dog = new Dog();
        get(dog);
    }

    // 形参式抽象类，传入的参数是抽象类的子类对象
    public static void get(Animal obj){
        obj.say();
    }
}

abstract class Animal {
    public abstract void say();

}

class Dog extends Animal {
    public void say(){
        System.out.println("Dog");
    }
}