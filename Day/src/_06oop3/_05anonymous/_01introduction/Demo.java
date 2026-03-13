package _06oop3._05anonymous._01introduction;

/*
	我们已经使用过匿名对象了，匿名对象的含义是这个对象是没有名字，
	没有引用指向它。
	那么匿名内部类，指的就是这个内部类没有名字。
	当然成员内部类和静态内部类没法没有名字，
	所以 匿名内部类指的是"没有名字的局部内部类"。是一种特殊的局部内部类

	语法:
	// 局部位置
    new 类名或者接口名(){
        // 某类名或接口名的子类的类体
    };
    // 局部位置
    解释说明：
    1. new表示创建对象，表示创建语法中"类名/接口名"的子类对象。
    2. 这个语法结构，我们只知道这是一个子类对象，但这个子类到底叫啥，
    不知道，所以它是一个匿名类。当然匿名内部类更准确的说法，应该叫匿名内部类对象。
    3. 匿名内部类的本质是，一个继承了类或者实现了接口的匿名子类对象。


 */


public class Demo {
    public static void main(String[] args) {
        // 匿名内部类
        new Father(){
            @Override
            public void method() {
                System.out.println("匿名子类对象");
            }
        }.method();

        new IA(){
            @Override
            public void method(){
                System.out.println("IA的匿名子类对象");
            }
        }.method();

    }
}

class Father {
    public  void method() {

    }
}

interface IA {
    default void method() {

    }
}
