package _05oop2.basic._02extends.var;

public class Demo {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.count);
    }
//    如果子类没有父类中的同名静态成员时,
//    直接用子类类名点访问，是可以访问到父类中的静态成员的
//    通常情况下，继承仅考虑普通成员而不考虑静态成员

}

class Father {

    //父类的静态成员变量
    public static int count = 0;

}

class Son extends Father{

}