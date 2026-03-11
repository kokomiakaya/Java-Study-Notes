package oop3exercise._02ex;

public class Test {
    public static void main(String[] args) {
        Person s1 = new Student("zhangsan",1,19);
        Person t1 = new Teacher("lisi",0,29);

        s1.eat();
        t1.eat();

        //
        Student s2 = (Student) s1;
        s2.practice();
        s2.learn();
    }
}

interface IStu{
    public void practice();

    // 定义变量的访问权限修饰符是public static final
    int num = 10;

    // default方法的访问权限修饰符是public，不可以更改
    default void learn(){
        System.out.println("learn ...");
    }
}

interface ITeacher{
    public void teachEng();
}

abstract class Person {
    String name;
    int gender;
    int age;

    public Person() {

    }

    public Person(String name, int gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public abstract void eat();
    public abstract void sleep();
}

class Student extends Person implements IStu{

    public Student(String name, int gender, int age) {
        super(name, gender, age);
    }

    public void eat() {
        System.out.println("Student eats ...");
    }

    public void sleep() {
        System.out.println("Student sleeps ...");
    }

    public void practice() {
        System.out.println("Student practices ...");
    }

}

class Teacher extends Person implements ITeacher{
    public Teacher(String name, int gender, int age) {
        super(name, gender, age);
    }

    public void eat() {
        System.out.println("Teacher eats ...");
    }

    public void sleep() {
        System.out.println("Teacher sleeps ...");
    }

    public void teachEng() {
        System.out.println("Teacher teaches Eng...");
    }

}

// 接口可以多继承
interface I extends ITeacher, IStu{

}