package FileHomework;

//
//给大家发一个目录,里面是多级目录与文件,使用递归的方式,将该目录里面的文件,目录全删除了.(目录为空才可以删)
//注意: 不要放在C盘

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        File dir = new File("E:\\CodeJava\\Test\\app2\\aa");
        deleteFile(dir);
    }

    public static void deleteFile(File dir) {
        File[] files = dir.listFiles();
        // 判断是文件还是目录
        for (File file : files) {
            if (file.isFile()) {
                // 是文件，删除
                file.delete();
                System.out.println("File: " + file.getAbsolutePath() + " deleted ...");
            }else if (file.isDirectory()) {
                // 是目录，递归删除
                deleteFile(file);
            }
        }
        System.out.println("dir: " + dir.getAbsolutePath() + " " + dir.delete());
    }

}

