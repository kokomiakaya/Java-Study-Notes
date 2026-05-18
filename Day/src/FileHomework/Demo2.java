package FileHomework;

//自己建立文件夹 ,放一些文件, 文件夹
//仅针对这三个条件提供规则方法，具体实现自己去做
//条件一：仅留下文件夹名包括a的文件夹
//条件二：仅留下.txt结尾的文本文件
//条件三：仅留下以a开头的文件


import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        File file = new File("E:\\CodeJava\\Test\\app2\\Demo2");
        File [] files = file.listFiles();
        System.out.println(Arrays.toString(files));

        System.out.println("------------------------");

        // 匿名对象的方式
//        File[] files2 = file.listFiles(new Demo2FileFilter() {});

        // 匿名内部类
//        File[] files2 = file.listFiles(new Demo2FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.getName().endsWith(".txt") ||
//                        pathname.getName().startsWith("a") ||
//                        (pathname.isDirectory() && pathname.getName().contains("a"));
//            }
//        });

        // lambda表达式
        File[] files2 = file.listFiles(pathname -> (pathname.getName().endsWith(".txt") ||
                pathname.getName().startsWith("a") ||
                (pathname.isDirectory() && pathname.getName().contains("a"))));
        System.out.println(Arrays.toString(files2));

    }
}

class Demo2FileFilter implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        return pathname.getName().endsWith(".txt") ||
                pathname.getName().startsWith("a") ||
                (pathname.isDirectory() && pathname.getName().contains("a"));
    }
}