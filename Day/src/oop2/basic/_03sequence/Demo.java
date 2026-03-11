package oop2.basic._03sequence;

public class Demo {
    public static void main(String[] args) {

        // 父类和子类的成员变量的赋值顺序
        Star star = new Star("zhangsan");
        System.out.println(star.stageName);
    }
}

class Person{

    String name;

    Person(){
        System.out.println("Person()");
    }

}

class Star extends Person{

    String stageName;

    Star(String stageName){
        // 如果没有显式地调用super()或者this()
        // 则会执行父类的无参构造方法
        System.out.println("Star(String stageName)");
        this.stageName = stageName;
    }
}

// 隐式子类对象初始化的必要条件：
//1. 父类中有默认的构造方法
//2. 子类的构造器中没有显式使用super调用父类的构造方法，也没有用this去调用自己的构造方法。