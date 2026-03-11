package oop1;

public class Demo1 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan");
        System.out.println(s1);
        s1.display();
    }

}


//    [类修饰符列表] class 类名{
//        // 类体
//    }

class Student {
    // 成员变量
    // [修饰符列表] 数据类型 成员变量名;
    // 成员变量，在整个类体中生效，在整个类中的成员方法中都可以访问它！

    public String name;

    Student() {

    }

    Student(String name) {
        // this关键字
        this.name = name;
    }

    public void display() {
        System.out.println(this.name);
    }
}