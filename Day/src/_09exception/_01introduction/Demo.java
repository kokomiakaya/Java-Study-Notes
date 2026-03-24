package _09exception._01introduction;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Error 代码处理不了
          //java.lang.StackOverflowError
//        func();

        // 除0异常
        // java.lang.ArithmeticException
//        System.out.println(10/0);

        // 数组访问越界
        // java.lang.ArrayIndexOutOfBoundsException
        String[] str = {"abc"};
//        str[1] = "def";

        // java.lang.NullPointerException
        // 空指针异常，在有指针使用条件前，对空指针进行判空
//        Demo demo = new Demo();
//        System.out.println(demo);
//        demo = null;
//        System.out.println(demo.toString());

        // 未处理的异常
        // java.lang.CloneNotSupportedException
        Demo demo = new Demo();
        demo.clone();

    }

    public static void func(){
        while(true){
            func();
        }
    }
}
