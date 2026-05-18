package _15reflect.bean;

public class Person {
    public String name;
    private int age;
    boolean gender;

    public Person(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Person(String name) {
        this.name = name;
    }

    public Person() {

    }

    public void eat() {
        System.out.println("eat food");
    }

    private void eat(String food) {
        System.out.println("eat" + food);
    }

    private String sleep(){
        return "sleep";
    }

    public String toString(){
        return "Person{" +
                "name= '" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
