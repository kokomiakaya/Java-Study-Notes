package _09exception._02handle._02trycatch;

/*
try{
   // 可能出现异常的代码
}catch(异常类型 对象名){
   // 对异常的处理操作
}catch(异常类型 对象名){
   // 对异常的处理操作
}catch(异常类型 对象名){
   // 对异常的处理操作
}.....


注意:
.如果说，在多catch分支的情况下，如果不同的catch分支，处理的异常类型，有父子关系
          那么就一定要注意，处理子类的异常分支写在前面，父类的异常分支写在后面
 */

public class Demo4 {
    public static void main(String[] args) {
        System.out.println("main start");
        System.out.println(10/0);
        try {
            System.out.println("main end");
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 多分支中，父类要写在子类的后面
    }
}
