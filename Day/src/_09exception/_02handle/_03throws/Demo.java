package _09exception._02handle._03throws;

public class Demo {
    public static void main(String[] args) {
//        func();
        try {
            func2();
        } catch (Exception e) {
            System.out.println("克隆异常");
        }

    }

    // 编译时异常，会强制回去处理
    public static void func() throws ArithmeticException, NullPointerException  {
        System.out.println(10/0);
    }

    // throws + 编译时异常
    // 表示异常不在这里处理,交给方法的调用者处理
    public static void func2() throws CloneNotSupportedException{
        Demo demo = new Demo();
        demo.clone();
    }

}

class Father {
    void m1() throws CloneNotSupportedException {

    }

    void m2() throws Exception {

    }

}

class Son extends Father {
    void m1() throws NullPointerException, ArithmeticException,ClassCastException {

    }

    void m2() throws NullPointerException, ArithmeticException, ClassCastException {

    }
}


