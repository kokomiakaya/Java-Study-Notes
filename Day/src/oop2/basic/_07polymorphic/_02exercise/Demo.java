package oop2.basic._07polymorphic._02exercise;

public class Demo {
    public static void main(String[] args) {
        Father fs = new Son();
        System.out.println(fs.age);
        fs.teach();

        Son son = (Son) fs;
        System.out.println(son.age);
        son.playGame();
    }
}

class Father {
    int age = 48;
    public void teach(){
        System.out.println("我要教Java");
    }
}

class Son extends Father {
    int age = 28;

    public void playGame() {
        System.out.println("喜欢玩大乱斗！");
    }

    public void teach() {
        System.out.println("我会教C++");
    }

}