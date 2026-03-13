package _06oop3._05anonymous._03usecase;

/*
匿名内部类实际上就是更简单的局部内部类（直接获取了对象），所以局部内部类的使用场景，可以直接套用过来。
匿名内部类经常使用在以下两个场景中：

1. 方法需要返回一个对象，返回值类型是引用数据类型时。
   方法需要返回一个对象时，可以在方法的局部位置写一个
   基于X类或X接口的匿名内部类对象 ，然后直接作为返回值返回给外界。

2. 方法需要传入一个对象，形参数据类型是引用数据类型时。
   方法需要传入一个对象实参时，可以在调用方法的实参位置填入一个
   基于X类或X接口的匿名内部类对象，就将它作为一个实参传给方法使用。

使用匿名内部类的优点：

1. 绝对对外界隐藏，封装。
2. 比起局部内部类，它更方便简洁了。所以实际开发中，匿名内部类基本取代了局部内部类的作用。

缺点：

1. 这个对象是一次性的。

总之，酌情使用匿名内部类对象，可以简化代码书写，方便省事。但不要为了使用而使用，假如存在多个场景都需要一个子类对象，那还是直接创建一个子类出来好了。
 */

public class Demo {
    public static void main(String[] args) {
        // 方法返回的是引用数据类型的变量
        Father f1 = func();
        f1.m1();

        // 方法返回的是引用数据类型的变量
        IA ia = func2();
        ia.m1();

        func3(new Father(){
            void m1(){
                System.out.println("void m1()");
            }
        });

        func4(new IA(){
            public void  m1(){
                System.out.println("void IA :: m1()");
            }
        });
    }

    public static Father func(){
        return new Father(){
            @Override
            void m1() {
                System.out.println("SSSSSSSS");
            }
        };
    }

    public static IA func2(){
        return new IA(){
            @Override
            public void m1() {
                System.out.println("IAAAAAAA");
            }
        };
    }

    public static void func3(Father f){
        System.out.println("void m2(Father f)");
    }

    public static void func4(IA ia){
        System.out.println("void func4(IA ia)");
    }

}

class Father {
    void m1() {
        System.out.println("FFFFFFFF");
    }
}

interface IA {
    void m1();
}