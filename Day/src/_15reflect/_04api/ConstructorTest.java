package _15reflect._04api;


import java.lang.reflect.Constructor;

public class ConstructorTest {
    public static void main(String[] args) throws Exception {
        // 获取字节码文件
        Class<?> personCls = Class.forName("_15reflect.bean.Person");
        System.out.println("获取所有public构造方法------");
//        Constructor[] constructors = personCls.getConstructors();
//        for (Constructor c : constructors) {
//            System.out.println(c);
//        }

        Constructor[] constructors = personCls.getDeclaredConstructors();
        for (Constructor c : constructors) {
            System.out.println(c);
        }


    }
}
