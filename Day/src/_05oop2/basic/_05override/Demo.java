package _05oop2.basic._05override;

public class Demo {
    public static void main(String[] args) {
        Father f = new Father();
        Father f2 = new Son();
        f.test();
        f2.test();
    }
}


class Father{
    // 相同命名的静态成员变量，还是两个量，并没有继承，而是相互独立的
    static int x;

    public void test(){
        System.out.println("Father.test()");
        x ++;
        System.out.println(x);
    }

}

class Son extends Father{
    static int x;
    public void test(){
        System.out.println("Son.test()");
        System.out.println(x += 2);
    }
}

// 成员方法的语法
// [访问权限修饰符] 返回值类型 方法名(形参列表){
// 方法体
// }
// 1. 子类中重写的方法，访问权限等级，必须至少保持一致，可以更为宽松，但一定不能更严格。
// 2. 子类中重写的方法，返回值类型必须和原先父类方法的返回值类型，保持兼容。
// 3. 子类中重写的方法，方法名必须严格保持一致，不能做任何修改。
// 4. 子类中重写的方法，形参列表必须保持严格一致，不能做任何修改。
// 5. 方法体的代码，无所谓，可以保持一致，也可以修改
