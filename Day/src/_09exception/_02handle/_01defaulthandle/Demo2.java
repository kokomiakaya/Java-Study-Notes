package _09exception._02handle._01defaulthandle;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("main start");
        func();
        System.out.println("main end");
    }

    public static void func() {
        System.out.println("func start");
        System.out.println(10/0);
        System.out.println("func end");
    }

}
