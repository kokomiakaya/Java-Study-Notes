package IOhomework.byteStream;

//分别键盘输入文件名 和 文件内容，并按照文件名保存相应的内容
//
//tips:
//  FileOutputStream
//  Scanner
// 异常处理

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件名:");
        String str = sc.nextLine();

        System.out.println("请输入文本内容");
        String str2 = sc.nextLine();
        saveContentToFile(str,str2);


    }

    public static void saveContentToFile(String str, String str2) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(str);
            fos.write(str2.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

}
