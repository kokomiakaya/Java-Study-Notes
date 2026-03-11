package oop1exercise.block;

public class Demo1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("zhangsan");
        Student s3 = new Student("lisi",18);

        System.out.println(Student.count);
    }
}

class Student {
    static int count;

    String name;
    int age;

    public Student() {

    }

    // 构造代码块
    {
        // 统计对象创建的次数
        count++;
    }

    public Student(String name){
        this.name = name;
    }

    public Student(String name, int age) {
        this(name);
        this.age = age;
    }

    public void displayCnt() {
        System.out.println("count = " + count);
    }

}
