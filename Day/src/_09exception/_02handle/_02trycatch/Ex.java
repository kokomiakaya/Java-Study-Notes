package _09exception._02handle._02trycatch;

public class Ex {
    public static void main(String[] args) {
        try {
            System.out.println("main start");
            System.out.println(10/0);
            System.out.println("main end");
        } catch (ArithmeticException e) {
            System.out.println("xxxxxxx");
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            System.out.println("sssssss");
        }
    }
}


