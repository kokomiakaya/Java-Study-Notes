package _10file._03ex;

import java.io.File;

public class Demo2 {
    public static void main(String[] args) {
//        递归输出某个目录下的所有java文件
        File file = new File("E:\\CodeJava\\Test\\app2");
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                if(f.getName().endsWith(".java")){
                    System.out.println(f.getAbsolutePath());
                }
            }
        }
    }
}
