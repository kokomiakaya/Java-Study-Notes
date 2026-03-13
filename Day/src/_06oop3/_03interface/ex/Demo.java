package _06oop3._03interface.ex;

public class Demo {
    public static void main(String[] args) {
        Player t = new TableTennisPlayer("zhangsan",18);
        t.play();

        TableTennisPlayer t2 = new TableTennisPlayer("lisi",20);
        t2.learn();
    }
}

abstract class Person{
    String name;
    int age;

    public void eat(){
        System.out.println("Person eat ...");
    }

}

abstract class Player extends Person{
    public abstract void play();
}

abstract class Coach extends Person{
    public abstract void teach();
}

interface ILearnEng{
    // 接口中的方法默认是public abstract的公共的抽象方法
    void learn();
}

class TableTennisPlayer extends Player implements ILearnEng{
    public void learn() {
        System.out.println("TableTennisPlayer learns English!");
    }

    public void play(){
        System.out.println("TableTennisPlayer plays Pingpong!");
    }

    TableTennisPlayer(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class BasketballPlayer extends Player{
    public void play(){
        System.out.println("BasketballPlayer plays Basketball!");
    }

    BasketballPlayer(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class TableTennisCoach extends Coach implements ILearnEng{
    public void learn() {
        System.out.println("TableTennisCoach learns English!");
    }

    public void teach(){
        System.out.println("TableTennisCoach teaches Pingpong!");
    }
}