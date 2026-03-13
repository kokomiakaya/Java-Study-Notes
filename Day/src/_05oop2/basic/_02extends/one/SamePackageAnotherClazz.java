package _05oop2.basic._02extends.one;

public class SamePackageAnotherClazz {
    public static void main(String[] args) {
        // 同包下，直接创建父类对象访问protected成员变量，可以访问
        CurrentClazz clazz = new CurrentClazz();
        System.out.println(clazz.age);

        // 同包下,直接创建子类对象访问protected成员变量，可以访问
        SamePackageSonClazz obj = new SamePackageSonClazz();
        System.out.println(obj.age);


    }
}
