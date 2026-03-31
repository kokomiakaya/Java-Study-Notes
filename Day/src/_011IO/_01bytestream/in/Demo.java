package _011IO._01bytestream.in;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
//        FileInputStream(File file)
//        通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的  File 对象 file 指定。
        FileInputStream fis = new FileInputStream(new File("E:\\CodeJava\\Test\\app2\\1.txt"));

//        FileInputStream(String fileName)
//        通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的路径名  name 指定。
        FileInputStream in =  new FileInputStream("E:\\CodeJava\\20260302\\Day\\a.txt");
//        System.out.println(in.read());



        byte[] bytes = new byte[1024];
        int readCount = in.read(bytes);
        System.out.println(readCount);

        in.close();
    }
}
