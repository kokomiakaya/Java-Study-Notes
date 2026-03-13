package _01array;

public class Demo4 {
    public static void main(String[] args) {
        // 可变长参数
        // 可变参数用于形参列表中，并且只能出现在形参列表的最后。
//        一个方法最多只能有一个可变长参数
//        [修饰符列表] 返回值类型 方法名 (形式参数列表,数据类型... 变量名){
//            // 方法体
//        }
        // 注意可变长参数与方法重载
//        调用方法时，如果出现两个可变参数的方法都能匹配，则报错，这两个方法都无法调用了

        String name = "zhangsan";
        int a = 1;
        int b = 2;
        int c = 3;
        func(name,a,b,c);
    }

    public static void func(String str,int... args){
        // 可变长参数相当于一个数组
        System.out.println(args.length);

    }
}
