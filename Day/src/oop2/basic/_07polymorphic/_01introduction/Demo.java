package oop2.basic._07polymorphic._01introduction;

public class Demo {
    public static void main(String[] args) {
        Cat cat = new Cat("布偶");
        Dog dog = new Dog("哈士奇");

        animalShout(cat);
        animalShout(dog);
    }

    public static void animalShout(Animal obj) {
        obj.shout();
    }

}



class Animal {
    String name;

    public  Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public void shout() {
        System.out.println("animal shout !");
    }

}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    public final void shout() {
        System.out.println("汪汪汪");
    }

}

class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    public final void shout() {
        System.out.println("喵喵喵");
    }

}