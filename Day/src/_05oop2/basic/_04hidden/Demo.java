package _05oop2.basic._04hidden;

public class Demo {
    public static void main(String[] args) {
        // 父类的引用创建父类的对象
        Father f = new Father(45);
        System.out.println(f.age);
        // 父类访问不到子类的成员变量
//        System.out.println(f.name);

        // 子类的引用接收子类对象
        Son s = new Son(18,"zhangsan");
        System.out.println(s.age);
        System.out.println(s.name);

        // 父类的引用接受子类对象
        Father f2 = new Son(20,"lisi");
        System.out.println(f2.age);
        // 访问不到父类中没有的成员变量
//        System.out.println(f2.name);

    }
}

class Father {
    //
    public int age;

    public Father() {

    }

    public Father(int age) {
        this.age = age;
    }


}


class Son extends Father {
    public String name;
    public int age;

    public Son() {

    }

    public Son(int age, String name) {
        this.age = age;
        this.name = name;
    }


}