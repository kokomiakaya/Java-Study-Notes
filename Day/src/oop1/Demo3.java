package oop1;

public class Demo3 {
    public static void main(String[] args) {
        Teacher tchA = new Teacher(18,"Java");
        Teacher tchB = new Teacher(28,"C++");
        Teacher tchC = new Teacher(30,"python");
        tchA.display();
        tchB.display();
        tchC.display();
    }
}

class A {

    //    构造器的作用是用来给成员变量赋值的，完成对对象的初始化
//[访问权限修饰符] 类名(形参列表){
//    // 构造方法体
//}
    public A(){

    }

}

class Teacher{
    int age;
    String course;

    // 无参构造方法
    public Teacher(){

    }

    // 一参构造方法
    public Teacher(int age){
        this.age = age;
    }

    public Teacher(String course){
        this.course = course;
    }

    // 两参数构造方法
    public Teacher(int age, String course){
//        this.age = age;
//        this.course = course;
        this(course);
        this.age = age;
    }

    public void display(){
        System.out.println("Teacher age: " + this.age + ", teaches " + this.course);
    }

}