package _011IO._01bytestream.buffer;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("a.txt"),4);

        // write
        bos.write("abcdef".getBytes());

        bos.flush();

        bos.close();
    }
}
