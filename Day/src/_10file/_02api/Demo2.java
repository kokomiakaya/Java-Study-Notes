package _10file._02api;

import java.io.File;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("E:\\CodeJava\\Test\\b.txt");
        file1.createNewFile();

        // public boolean renameTo(File dest)
        // 在源文件，和修改之后的目标文件在同一目录的时候：
        // 效果是重命名
        System.out.println(file1.renameTo(new File("E:\\CodeJava\\Test\\c.txt")));

        // 当源文件和修改之后的目标文件，不在同一目录时：
        // 1.移动文件
        // 2.重新命名
        // tips:如果修改后的目标文件的文件夹不存在时
        // 1.不会创建新的文件夹
        // 2.会直接返回false
        File file2 = new File("E:\\CodeJava\\Test\\d.txt");
        file2.createNewFile();

        System.out.println(file2.renameTo(new File("E:\\CodeJava\\Test\\dir1\\e.txt")));

        // 删除此抽象路径名表示的文件或目录。如果此路径名表示一个目录，则该目录必须为空才能删除
        // delete不会因为文件不存在,路径名不正确而抛出异常,只会返回false, 并且不会进入回收站
        System.out.println(file1.delete());

        // 这里并没有将e.txt删除
        // file2所指的对象始终是d.txt
        System.out.println(file2.delete());
    }
}
