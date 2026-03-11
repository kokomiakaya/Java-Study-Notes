package oop1.singleton;

public class Demo2 {
    public static void main(String[] args) {

        Singleton2 s1 = Singleton2.getInstance();
//        System.out.println("Main()");
    }

}

// 单例模式的立即加载
class Singleton2 {

    // 静态成员变量
    static Singleton2 instance = new Singleton2();
    static {
        System.out.println("Singleton2 instance created");
    }

    // 构造器私有化
    private Singleton2() {
        System.out.println("Singleton2()");
    }

    // 提供一个静态方法，返回单例模式的对象
    public static Singleton2 getInstance() {
        return instance;
    }
}