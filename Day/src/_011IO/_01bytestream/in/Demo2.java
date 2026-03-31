package _011IO._01bytestream.in;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("test.txt");
        byte[] bytes = new byte[4];
        int readCount = fis.read(bytes);
        System.out.println(new String(bytes));

        System.out.println("----------------------------------------");

        int readCount2 = fis.read(bytes,0,2);
        System.out.println(new String(bytes, 0, readCount2));

        // 关闭fis
        fis.close();
    }
}

// int read()
//从输入流中读取数据的下一个字节。返回 0 到 255 范围内的 int 字节值。
//如果因为已经到达流末尾而没有可用的字节，则返回值 -1。
//在输入数据可用、检测到流末尾或者抛出异常前，此方法一直阻塞。返回值代表了读取到的字节值  readData

// int read(byte[] b,int off,int len)
// off 目标数组 b的起始偏移量