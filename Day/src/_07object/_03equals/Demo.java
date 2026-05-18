package _07object._03equals;

import java.io.Serializable;

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s1));
    }
}

class Student implements Serializable {

    private static final long serialVersionUID = -7066796902567625191L;
}
