package _10file._03ex;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
//        输出某个目录(单级)下的所有java文件,使用过滤器.
        File file = new File("E:\\CodeJava\\Test\\app2");
        // 匿名对象的方式
//        File[] files = file.listFiles(new MyFileFilter() {});
//        System.out.println(Arrays.toString(files));

        // 匿名内部类
//        File[] files2 = file.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.getName().endsWith(".java");
//            }
//        });
//        System.out.println(Arrays.toString(files2));

        // lambda表达式
        File[] files3 = file.listFiles((pathname -> pathname.getName().endsWith(".java")));
        System.out.println(Arrays.toString(files3));

    }
}

class MyFileFilter implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        return pathname.getName().endsWith(".java");
    }
}
