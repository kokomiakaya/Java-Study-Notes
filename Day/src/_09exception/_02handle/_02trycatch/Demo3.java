package _09exception._02handle._02trycatch;

/*
捕获异常信息
getMessage()
   获取异常信息，返回字符串。
toString()
    获取异常类名和异常信息，返回字符串。
printStackTrace()
    获取异常类名和异常信息，以及异常出现在程序中的位置,
    并打印到控制台
 */


public class Demo3 {
    public static void main(String[] args) {
        try {
            System.out.println("main start");
            System.out.println(10/0);
            System.out.println("main end");
        } catch (ArithmeticException e) {
            // getMessage() 获取异常信息，返回字符串
//            System.out.println(e.getMessage());

            // toString()
//            System.out.println(e.toString());

            // printStackTrace()
            e.printStackTrace();
        }
        System.out.println("over");
    }
}
