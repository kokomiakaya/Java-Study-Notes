package _011IO._01bytestream.in;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileInputStream in =  new FileInputStream("E:\\CodeJava\\20260302\\Day\\a.txt");
//        System.out.println(in.read());

        byte[] bytes = new byte[1024];
        int readCount = in.read(bytes);
        System.out.println(readCount);

        in.close();
    }
}
