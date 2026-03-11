package oop2exercise._02exercise;

public class Demo {
    public static void main(String[] args) {
//  1.编译看左边，运行看右边（针对普通方法）。
//  2.编译看左边，运行也看左边（针对成员变量和静态方法）。

            Son s = new Son();
            Son s2 = new Son();
            Father fs = new Son();
            Father f = new Father();

        System.out.println(fs.getNum());
        System.out.println(f.getNum());
    }
}

class Father {
    int num = 100;

    public int getNum(){
        return num;
    }

    public Father(){
        System.out.println(getNum());
    }

}

class Son extends Father{

    int num = 200;

    public int getNum(){
        return num;
    }

    public Son(){
        super();
    }

    public Son(int num){
        this.num = num;
    }

}
