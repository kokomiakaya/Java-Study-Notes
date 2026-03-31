package _011IO._01bytestream.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        // 创建输入流对象
        FileInputStream fis = new FileInputStream("E:\\CodeJava\\20260302\\Day\\The_Holy_Bible.txt");

        long start = System.currentTimeMillis();

        // 创建输出流对象
        FileOutputStream fos = new FileOutputStream("E:\\CodeJava\\20260302\\Day\\copy.txt");
//        copy(fis,fos);
        copy2(fis,fos);

        long end = System.currentTimeMillis();
        System.out.println(end-start + "ms");

        fis.close();
        fos.close();
    }

    public static void copy(FileInputStream fis, FileOutputStream fos) throws IOException {
        int readCount;
        byte[] buf = new byte[1024];
        while ((readCount = fis.read(buf))!= -1) {
            // 写操作
            fos.write(buf, 0, readCount);
        }
    }

    public static void copy2(FileInputStream fis, FileOutputStream fos) throws IOException {
        int readData;
        while((readData = fis.read())!=-1 ){
          fos.write(readData);
        }
    }

}
