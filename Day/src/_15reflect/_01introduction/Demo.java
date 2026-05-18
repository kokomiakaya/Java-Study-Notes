package _15reflect._01introduction;

public class Demo {
    public static void main(String[] args) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        ClassLoader parent2 = parent.getParent();
        System.out.println(parent2);

        System.out.println("--------");
        // 查看系统类加载器的加载路径
        System.out.println(System.getProperty("java.class.path").
                replace(java.io.File.pathSeparator, System.lineSeparator()));

    }
}
