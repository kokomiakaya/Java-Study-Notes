package _011IO._01bytestream.buffer;


import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\CodeJava\\20260302\\Day\\a.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        // write 写数据
        // void write(int b)
        bos.write(97);

        // void write(byte[] b)
        bos.write(System.lineSeparator().getBytes());
        bos.write("yyds".getBytes());

        // void write(byte[] b,int off,int len)
        bos.write(System.lineSeparator().getBytes());
        bos.write("hello,world".getBytes(),0,3);

        bos.close();
    }
}
