package oop1;

public class Demo4 {
    public static void main(String[] args) {

    }
}

class Student2{
    // 成员变量的显式初始化
    int age = 10;
    String name = "zhangsan";
    double a = 100;

    public Student2(){
        System.out.println("Student2()");
    }

    public Student2(int age, String name){
        System.out.println("Student2(int age,String name)");
        this.age = age;
        this.name = name;
    }

}
