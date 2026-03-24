package _09exception._02handle._01defaulthandle;

/*
jvm默认处理
1. 当我们代码在执行到，发生错误的地方。
2. 一旦发生错误，jvm就会终止我们自己程序的运行，转而执行jvm自己的错误处理流程
3. 在发生错误地方，收集错误信息，产生一个描述错误的对象
4. 访问收集到的错误信息，将错误信息，输出到控制台窗口中
 */

public class Demo {
    public static void main(String[] args) {
        System.out.println("main start");
        System.out.println(10/0);
        System.out.println("main end");
    }
}
