package _07object._02tostring;

public class Demo {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        System.out.println(t);
        // getClass() 获取字节码文件
        Class<? extends Teacher> c = t.getClass();
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());
        // toString 打印的是getClass().getName + @ + 十六进制地址值
        System.out.println(t.toString());
    }
}

class Teacher{

}