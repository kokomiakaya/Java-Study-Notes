package _05oop2.basic._02extends.one;

public class SamePackageSonClazz extends CurrentClazz {
    // 同包下的子类访问protected成员
    public static void main(String[] args) {
        SamePackageSonClazz s = new SamePackageSonClazz();
        System.out.println(s.age);
    }

}
