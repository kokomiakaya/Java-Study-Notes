package _011IO._01bytestream.in;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[1024];
        int readCount = -1;

        FileInputStream fis = new FileInputStream("test.txt");

        // 字节数组读取
        while((readCount = fis.read(bytes))!= -1){
            System.out.println(new String(bytes,0,readCount));

        }

        // 单字节读取
        FileInputStream fis2 = new FileInputStream("test.txt");
        readWhile(fis2);

        fis.close();
        fis2.close();
    }

    public static void readWhile(FileInputStream fis) throws IOException {
        int readData;
        while((readData = fis.read()) != -1){
            System.out.print((char)readData);
        }
    }

}
