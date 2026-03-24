package _09exception._02handle._02trycatch;

public class Demo2 {
    public static void main(String[] args) {
        try{
            System.out.println("main start");
            System.out.println(10/0);
            Demo2 demo2 = new Demo2();
            demo2 = null;
            System.out.println(demo2.toString());
            System.out.println("main end");
        }catch (NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("捕获到了异常");
        }
    }
}
