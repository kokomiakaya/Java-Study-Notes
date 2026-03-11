package oop1;

public class Demo2 {
    public static void main(String[] args) {
        Stu s1 = new Stu();
        // 两个结果一致，证明this是当前对象的引用
        System.out.println(s1);
        s1.printThis();
    }
}

class Stu {
    String name;
    // 在每个类的成员方法中，形参列表都隐含了一个this，传入的是当前对象
    public void printThis(){
        System.out.println(this);
    }

}