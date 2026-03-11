package oop2.basic._02extends.another;

import oop2.basic._02extends.one.CurrentClazz;

public class AnotherPackageSonClazz extends CurrentClazz {


    public static void main(String[] args) {
        // 不同包下的父类访问protected成员变量
//        CurrentClazz clazz = new AnotherPackageSonClazz();
//        System.out.println(clazz.age);

        // 不同包下的子类访问protected成员变量
        AnotherPackageSonClazz clazz2 = new AnotherPackageSonClazz();
        System.out.println(clazz2.age);
    }

}
