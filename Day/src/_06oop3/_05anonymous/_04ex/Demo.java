package _06oop3._05anonymous._04ex;

/*
不修改main方法和接口Inter的前提下，补齐Outer类代码，要求在控制台输出HelloWorld

分析:
    Outer.method() ---> method方法是个静态的方法
    Outer.method().show();
        show()方法是接口中的方法,通过接口的子类对象去调用
        Outer.method()会得到一个返回值,返回值的对象肯定是接口的子类对象
        ---->method()方法的返回值类型是父类型 接口类型Inter类型


几种实现方式
- 手写类实现接口
- 局部内部类
- 匿名内部类
- lambda表达式
 */


public class Demo {
    public static void main(String[] args) {
        Outer.method().show();

    }
}
interface Inter {
    void show();
}

class Outer {
    public static Inter method() {
//        return new InterImpl();
//        class Inner implements Inter {
//           public void show(){
//               System.out.println("hello world");
//            }
//        }
//        return new Inner();
        return new Inter() {
           public void show(){
                System.out.println("Hello World");
            }
        };
    }
}

//class InterImpl implements Inter {
//    public void show() {
//        System.out.println("Hello World");
//    }
//}