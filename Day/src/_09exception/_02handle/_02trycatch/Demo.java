package _09exception._02handle._02trycatch;

/*
方式一:
try{
   // 可能出现异常的代码
}catch(异常类型 对象名){
   // 对异常的处理操作
}
 */

public class Demo {
    public static void main(String[] args) {
//        try{
//            System.out.println("main start");
//            System.out.println(10/0);
//            System.out.println("main end");
//        }catch (ArithmeticException e){
//            System.out.println("捕获到了算数异常");
//        }
//        System.out.println("over");

        try{
            System.out.println("main start");
            System.out.println(10/0);
            System.out.println("main end");
        }catch (Exception e){
            System.out.println("捕获到了算数异常");
        }
        System.out.println("over");
    }
}
