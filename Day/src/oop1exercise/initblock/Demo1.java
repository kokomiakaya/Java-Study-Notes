package oop1exercise.initblock;

public class Demo1 {
    public static void main(String[] args) {
        Cat c = new Cat(28,"紫色");
    }
}

class Cat{
    {
        age = 18;
        System.out.println("age building block");
    }

    int age = 10;
    String color = "黄色";

    {
        color = "黑色";
        System.out.println("color building block");
    }

    public Cat(){

    }

    public Cat(int age){
        System.out.println("Cat(int age)");
        this.age = age;
    }

    public Cat(int age, String color){
        this(age);
        System.out.println("Cat(int age, String color)");
        this.color = color;
    }

}
