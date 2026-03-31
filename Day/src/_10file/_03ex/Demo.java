package _10file._03ex;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
//        判断某个目录(单级)下有没有a.jpg文件,有的话输出

        // 拿到目录
        File fileDir = new File("E:\\CodeJava\\Test\\app2");

        File[] files = fileDir.listFiles();
        for(File file : files) {
            // 判断是不是文件
            if(file.isFile()) {
                if("a.jpg".equals(file.getName())) {
                    System.out.println(file.getAbsolutePath());
                    break;
                }
            }
        }
    }
}
