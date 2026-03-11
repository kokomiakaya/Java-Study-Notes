package oop1.singleton;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Main()");
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}

// 单例模式的懒加载实现
class Singleton {

    // 构造器私有化
    // 静态成员变量，保证只有一份

    static Singleton instance;

    private Singleton() {
        System.out.println("Singleton()");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
