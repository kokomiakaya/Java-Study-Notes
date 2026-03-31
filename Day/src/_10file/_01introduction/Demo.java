package _10file._01introduction;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws IOException {
        // 获得当前工作路径
        System.out.println(System.getProperty("user.dir"));
//        E:\CodeJava\20260302\Day
        // 三个构造函数
//        File (String pathname)
//        File (String parent, Sting child)
//        File (File parent, String child)

        //        File (String pathname)
        File fileTest = new File("test.txt");
        System.out.println(fileTest.createNewFile());

        File file = new File("E:\\CodeJava\\Test\\app2\\2.txt");
        // 判断文件存不存在
        System.out.println(file.exists());
        System.out.println(file.createNewFile());

        //        File (String parent, Sting child)
        File file2 = new File("E:\\CodeJava\\Test\\app2","a.txt");
        System.out.println(file2.createNewFile());


        //        File (File parent, String child)
        File file3 = new File(new File("E:\\CodeJava\\Test\\app2"),"c.txt");
        System.out.println(file3.createNewFile());

        System.out.println("-------------");

        System.out.println(file3.isFile());
        System.out.println(file3.isDirectory());

        // public String getAbsolutePath() 获得文件的绝对路径
        System.out.println(file3.getAbsolutePath());
        //  public String getPath() 对象表示文件的抽象文件，路径字符串
        System.out.println(file3.getPath());
        // public String getName()获得文件、目录的名字
        System.out.println(file3.getName());

        //返回由此抽象路径名表示的文件的长度。不能返回文件夹的长度
    //此抽象路径名表示的文件的长度，以字节为单位；如果文件不存在，则返回 0L
        System.out.println(file3.length());

        System.out.println("-----------");
        File fileDir = new File("E:\\CodeJava\\Test\\app2");
        //返回一个字符串数组，这些字符串包括，此抽象的路径名表示的目录中的所有文件和文件夹的名字
//如果File对象表示的是一个文件，则返回null
//只能获取当前目录的下一层，并不是获取所有层级
//如果是一个空目录，返回一个长度为0的数组，而不是null  []
   //     public String[] list()
        System.out.println(fileDir.isDirectory());
        String[] files = fileDir.list();
        System.out.println(Arrays.toString(files));

//  返回指定File目录下的文件和文件夹的绝对路径形式的File对象数组
//  如果File对象表示的是一个文件，则返回null
//  只能获取当前目录的下一层，并不是获取所有层级
//  如果是一个空目录，返回一个长度为0的数组，而不是null
//        public File[] listFiles()
        File[] files2 = fileDir.listFiles();
        System.out.println(Arrays.toString(files2));




    }
}
