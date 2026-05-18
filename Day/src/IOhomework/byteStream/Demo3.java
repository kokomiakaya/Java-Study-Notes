package IOhomework.byteStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        // 用try-with-resource
        writeToFile();
    }

    private static void writeToFile() {

        System.out.println("请输入文件名：");
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        try(FileOutputStream fos = new FileOutputStream(fileName,true)) {
            while(true){
                System.out.println("请输入文件内容：");
                String line = sc.nextLine();
                if ("end".equals(line)) {
                    break;
                }
                fos.write(line.getBytes());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
