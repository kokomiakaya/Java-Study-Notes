package _011IO._01bytestream.buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis =
                new BufferedInputStream(new FileInputStream("The_Holy_Bible.txt"));

        // read()
        int readData =  bis.read();
        System.out.println(((char) readData));

        // read(byte[] b)
        byte[] bytes = new byte[1024];
        int readCount = bis.read(bytes);
        System.out.println(new String(bytes, 0, readCount));

        bis.close();
    }
}
