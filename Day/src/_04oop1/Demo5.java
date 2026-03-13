package _04oop1;

public class Demo5 {
    public static void main(String[] args) {
        // 创建对象的赋值顺序
        StuDemo stu = new StuDemo(18,"zhangsan");

    }
}


class StuDemo{
    int age = 10;
    String name = "zhangsan";
    double a = 100;

    public StuDemo() {

    }

    public StuDemo(int age) {
        this.age = age;
    }

    public StuDemo(int age, String name) {
        this(age);
        this.name = name;
    }

}