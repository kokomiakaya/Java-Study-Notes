package oop2exercise;

public class Demo {
    public static void main(String[] args) {

        PrimaryStrudent primaryStrudent = new PrimaryStrudent(666,888,"hello");
        System.out.println(primaryStrudent.psVar);

    }
}

class Person {
    static {
        System.out.println("Person 类加载");
    }

    {
        System.out.println("Person 构造代码块");
    }

    public Person() {
        System.out.println("Person 类的无参构造");
    }

}

class Student extends Person {
    static{
        System.out.println("Student 类加载");
    }

    {
        System.out.println("Student 构造代码块");
    }

    int sVar;
    String sVarString;

    public Student() {
        System.out.println("Student ()");
    }

    public Student(int sVar) {
        System.out.println("Student (int sVar)");
    }

    public Student(int sVar, String sVarString) {
        this(sVar);
        System.out.println("Student (int sVar, String sVarString)");
        this.sVarString = sVarString;
    }

}

class PrimaryStrudent extends Student {
    static {
        System.out.println("PrimaryStrudent 类加载");
    }

    {
        System.out.println("PrimaryStrudent 构造代码块");
    }

    int psVar = 10;

    public PrimaryStrudent(int psVar,int sVar,String sVarString) {
        super(sVar,sVarString);
        System.out.println("PrimaryStrudent 类的三参构造");
        this.psVar = psVar;
    }

}