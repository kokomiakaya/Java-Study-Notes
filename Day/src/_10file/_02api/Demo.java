package _10file._02api;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\CodeJava\\Test\\a.txt");
        System.out.println(file.createNewFile());
//        System.out.println(System.getProperty("user.dir"));

        // 创建单级目录
        File dir = new File("E:\\CodeJava\\Test\\dir1");
        System.out.println(dir.mkdir());

        // 创建多级目录
        File dir2 = new File("E:\\CodeJava\\Test\\dir1\\dir2");
        System.out.println(dir2.mkdir());


    }
}
