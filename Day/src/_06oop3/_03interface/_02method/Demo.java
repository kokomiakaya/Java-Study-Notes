package _06oop3._03interface._02method;

public class Demo {
    public static void main(String[] args) {
        m1(new Father());
        m1(new Son());

        // 抽象类不能创建对象，方法传参是其实现的子类对象
        m2(new Son2());

        m3(new IAImpl());
    }

    public static void m1(Father f) {

    }

    public static void m2(Father2 f2) {

    }

    // 接口不能创建对象，形参接受的是其实现类
    public static void m3(IA ia){

    }

}


class Father{

}

class Son extends Father{

}

// 抽象类
abstract class Father2{

}

class Son2 extends Father2{

}

interface IA{

}

class IAImpl implements IA{

}
